package partOne.task5;

public class FatalLogger extends Logger {
    public FatalLogger() {
        super(LogLevel.FATAL);
    }

    void handle(String message) {
        System.out.println("Sending SMS to system admin...");
    }
}
