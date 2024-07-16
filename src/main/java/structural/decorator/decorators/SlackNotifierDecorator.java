package structural.decorator.decorators;

import structural.decorator.Notifier;

public class SlackNotifierDecorator extends BaseNotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String message) {
        this.wrappedNotifier.notify(message);
        System.out.println("From Slack notifier");
    }

}
