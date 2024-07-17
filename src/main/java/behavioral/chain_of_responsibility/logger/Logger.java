package behavioral.chain_of_responsibility.logger;

public abstract class Logger {

    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int WARNING = 3;
    public static final int ERROR = 4;

    protected int level;
    protected Logger next;

    public Logger(int level) {
        this.level = level;
    }

    public Logger(int level, Logger next) {
        this.level = level;
        this.next = next;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    public void logMessage(int level, String message) {
        if(this.level >= level) {
            writeMessage(message);
        }
        if(next != null) {
            next.logMessage(level, message);
        }
    }

    public abstract void writeMessage(String message);

}
