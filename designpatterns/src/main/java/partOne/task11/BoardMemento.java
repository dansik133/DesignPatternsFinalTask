package partOne.task11;

public class BoardMemento {
    private int savedNumber;
    private int savedX;
    private int savedY;

    public BoardMemento(int savedNumber, int savedX, int savedY) {
        this.savedNumber = savedNumber;
        this.savedX = savedX;
        this.savedY = savedY;
    }

    public int getSavedNumber() {
        return savedNumber;
    }

    public int getSavedX() {
        return savedX;
    }

    public int getSavedY() {
        return savedY;
    }
}
