package partOne.task5;

public enum LogLevel {
    INFO(0), ERROR(1), FATAL(2);

    private int level;

    LogLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
