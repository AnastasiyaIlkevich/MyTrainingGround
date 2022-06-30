package FreeIt;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    // Game snake

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static String[][] playingField;
    static boolean finish =false;
    static int first = random.nextInt(20 - 1);

    public static void main(String[] args) {

        gameMove();

        gameLogic();
    }

    private static void gameMove() {
        if (first % 2 != 0) {
            computerLogic();
        } else {
            playerGame();
        }

    }

    private static void gameLogic() {
        while (!finish){
            gameMove();
          finish = victoryCheck();

        }
    }

    private static boolean victoryCheck() {

        return true;
    }

    private static void playerGame() {
        int playerMoveX = scanner.nextInt();
        int playerMoveY = scanner.nextInt();
        if (playingField[playerMoveX][playerMoveY] == null) {
            playingField[playerMoveX][playerMoveY] = "X";
        } else {
            computerLogic();
        }
    }

    private static void computerLogic() {
        int computerMoveX = random.nextInt(2);
        int computerMoveY = random.nextInt(2);
        if (playingField[computerMoveX][computerMoveY] == null) {
            playingField[computerMoveX][computerMoveY] = "X";
        } else {
            computerLogic();
        }
    }
}
