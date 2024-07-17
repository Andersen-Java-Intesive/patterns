package behavioral.chain_of_responsibility.logger;

public class DebugLogger extends Logger {

    public DebugLogger() {
        super(Logger.DEBUG);
    }

    public DebugLogger(Logger next) {
        super(Logger.DEBUG, next);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("[DEBUG]: " + message);
    }

}
