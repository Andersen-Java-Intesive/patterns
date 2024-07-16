package structural.decorator.decorators;

import structural.decorator.Notifier;

public class TelegramNotifierDecorator extends BaseNotifierDecorator{

    public TelegramNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String message) {
        this.wrappedNotifier.notify(message);
        System.out.println("From Telegram notifier");
    }

}
