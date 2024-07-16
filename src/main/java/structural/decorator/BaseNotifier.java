package structural.decorator;

public class BaseNotifier implements Notifier {
    @Override
    public void notify(String message) {
        System.out.println("Notification: " + message);
    }
}
