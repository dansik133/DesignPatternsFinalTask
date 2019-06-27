package partOne.task11;

import java.util.Scanner;

public class GameManager {
    public static void play() {
        BoardPlayerMover boardPlayerMover = new BoardPlayerMover();
        Scanner reader = new Scanner(System.in);
        String input = "";

        boardPlayerMover.printBoard();

        while (!input.equals("X")) {
            input = reader.next();

            switch (input) {
                case "1":
                    boardPlayerMover.moveUp();
                    break;
                case "2":
                    boardPlayerMover.moveDown();
                    break;
                case "3":
                    boardPlayerMover.moveRight();
                    break;
                case "4":
                    boardPlayerMover.moveLeft();
                    break;
                case "+":
                    boardPlayerMover.numberUp();
                    break;
                case "-":
                    boardPlayerMover.numberDown();
                    break;
                case "S":
                    boardPlayerMover.savePosition();
                    break;
                case "L":
                    if(!boardPlayerMover.goBackToLast())
                        input = "X";
                    break;
            }

            boardPlayerMover.printBoard();
        }
    }
}
