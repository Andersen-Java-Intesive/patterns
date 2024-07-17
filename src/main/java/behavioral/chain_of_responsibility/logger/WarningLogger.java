package behavioral.chain_of_responsibility.logger;

public class WarningLogger extends Logger {

    public WarningLogger() {
        super(Logger.WARNING);
    }

    public WarningLogger(Logger next) {
        super(Logger.WARNING, next);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("[WARNING]: " + message);
    }

}
