package structural.decorator;

import structural.decorator.decorators.FacebookNotifierDecorator;
import structural.decorator.decorators.SlackNotifierDecorator;
import structural.decorator.decorators.SmsNotifierDecorator;
import structural.decorator.decorators.TelegramNotifierDecorator;

public class Client {

    private static Notifier firstUserNotifier;
    private static Notifier secondUserNotifier;
    private static Notifier thirdUserNotifier;

    private static void configure() {
        firstUserNotifier =
                new SlackNotifierDecorator(
                        new TelegramNotifierDecorator(
                                new BaseNotifier()));

        secondUserNotifier =
                new FacebookNotifierDecorator(
                        new SlackNotifierDecorator(
                                new SlackNotifierDecorator(
                                        new TelegramNotifierDecorator(
                                                new BaseNotifier()
                                        )
                                )
                        )
                );

        thirdUserNotifier =
                new SmsNotifierDecorator(
                        new BaseNotifier()
                );
    }

    static void runBusinessLogic() {
        firstUserNotifier.notify("message for first user");
        secondUserNotifier.notify("message for second user");
        thirdUserNotifier.notify("message for third user");
    }


    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
}
