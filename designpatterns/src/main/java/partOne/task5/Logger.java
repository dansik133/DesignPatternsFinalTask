package partOne.task5;

public abstract class Logger {
    private Logger nextLogger;
    private LogLevel logLevel;

    public Logger(LogLevel level) {
        logLevel = level;
    }

    public Logger setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;

        return nextLogger;
    }

    private boolean hasNextLogger() {
        return nextLogger != null;
    }

    void runNextLogger(String message, LogLevel level) {
        if (hasNextLogger()) {
            nextLogger.log(message, level);
        }
    }

    public void log(String message, LogLevel level) {
        if (logLevel.getLevel() <= level.getLevel()) {
            handle(message);
        }

        runNextLogger(message, level);
    }

    abstract void handle(String message);
}
