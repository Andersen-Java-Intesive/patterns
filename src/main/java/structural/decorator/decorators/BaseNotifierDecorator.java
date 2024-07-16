package structural.decorator.decorators;

import structural.decorator.Notifier;

public abstract class BaseNotifierDecorator implements Notifier {

    protected Notifier wrappedNotifier;

    public BaseNotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }
}
