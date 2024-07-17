package behavioral.chain_of_responsibility;


import behavioral.chain_of_responsibility.logger.DebugLogger;
import behavioral.chain_of_responsibility.logger.ErrorLogger;
import behavioral.chain_of_responsibility.logger.InfoLogger;
import behavioral.chain_of_responsibility.logger.Logger;
import behavioral.chain_of_responsibility.logger.WarningLogger;

public class Client {

    private static Logger fullLoggerChain;
    private static Logger minimalLoggerChain;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        fullLoggerChain =
                new ErrorLogger(
                        new WarningLogger(
                                new InfoLogger(
                                        new DebugLogger())));
        minimalLoggerChain = new ErrorLogger();
        minimalLoggerChain.setNext(new WarningLogger());
    }

    static void runBusinessLogic() {
        fullLoggerChain.logMessage(Logger.DEBUG, "full logging");
        minimalLoggerChain.logMessage(Logger.ERROR, "error logging");
    }

}
