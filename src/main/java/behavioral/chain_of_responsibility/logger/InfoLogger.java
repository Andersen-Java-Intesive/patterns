package behavioral.chain_of_responsibility.logger;

public class InfoLogger extends Logger {

    public InfoLogger() {
        super(Logger.INFO);
    }

    public InfoLogger(Logger next) {
        super(Logger.INFO, next);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("[INFO]: " + message);
    }

}
