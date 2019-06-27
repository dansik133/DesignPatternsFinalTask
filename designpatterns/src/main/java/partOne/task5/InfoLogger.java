package partOne.task5;

public class InfoLogger extends Logger {
    public InfoLogger() {
        super(LogLevel.INFO);
    }

    void handle(String message) {
        System.out.println(message);
    }
}
