package partOne.task11;

public class BoardPlayerMover {
    private static final int MATRIX_SIZE = 5;

    private BoardCareTaker savedPlayer;
    private int savedNumber;
    private int savedX;
    private int savedY;

    public  BoardPlayerMover() {
        savedPlayer = new BoardCareTaker();
        savedNumber = 1;
        savedY = 1;
        savedX = 1;
        savePosition();
    }

    public void printBoard() {
        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                if (i == savedY && j == savedX)
                    System.out.print(" " + savedNumber + " ");
                else
                    System.out.print(" . ");
            }

            System.out.println();
        }
    }

    public void savePosition() {
        savedPlayer.AddMemento(
                new BoardMemento(savedNumber, savedX, savedY));
    }

    private void resetToLastSave() {
        BoardMemento lastSave = savedPlayer.getLast();

        savedNumber = lastSave.getSavedNumber();
        savedY = lastSave.getSavedY();
        savedX = lastSave.getSavedX();
    }

    public boolean goBackToLast() {
        BoardMemento lastSave = savedPlayer.getAndRemoveLast();

        if(lastSave == null)
            return false;

        savedNumber = lastSave.getSavedNumber();
        savedY = lastSave.getSavedY();
        savedX = lastSave.getSavedX();

        return true;
    }

    public void moveUp() {
        if(savedY > 0) {
            savedY --;
        } else {
            resetToLastSave();
        }
    }

    public void moveDown() {
        if(savedY < MATRIX_SIZE - 1) {
            savedY ++;
        } else {
            resetToLastSave();
        }
    }

    public void moveRight() {
        if(savedX < MATRIX_SIZE - 1) {
            savedX ++;
        } else {
            resetToLastSave();
        }
    }

    public void moveLeft() {
        if(savedX > 0) {
            savedX --;
        } else {
            resetToLastSave();
        }
    }

    public void numberUp() {
        if(savedNumber < 9) {
            savedNumber ++;
        }
    }

    public void numberDown() {
        if(savedNumber > 0) {
            savedNumber --;
        }
    }

}
