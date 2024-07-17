package behavioral.chain_of_responsibility.logger;

public class ErrorLogger extends Logger {

    public ErrorLogger() {
        super(Logger.ERROR);
    }

    public ErrorLogger(Logger next) {
        super(Logger.ERROR, next);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("[ERROR]: " + message);
    }

}
