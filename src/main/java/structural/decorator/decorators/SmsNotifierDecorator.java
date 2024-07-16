package structural.decorator.decorators;

import structural.decorator.Notifier;

public class SmsNotifierDecorator extends BaseNotifierDecorator{

    public SmsNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String message) {
        this.wrappedNotifier.notify(message);
        System.out.println("From SMS notifier");
    }
}
