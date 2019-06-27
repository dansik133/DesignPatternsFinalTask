package partOne.task5;

public class ErrorLogger extends Logger {
    public ErrorLogger() {
        super(LogLevel.ERROR);
    }

    public void handle(String message) {
        System.out.println("Writing message to file...");
    }
}
