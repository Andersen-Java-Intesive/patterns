package structural.decorator.decorators;

import structural.decorator.Notifier;

public class FacebookNotifierDecorator extends BaseNotifierDecorator{

    public FacebookNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String message) {
        this.wrappedNotifier.notify(message);
        System.out.println("From Facebook notifier");
    }

}
