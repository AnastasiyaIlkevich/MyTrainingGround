package OvO.BooleanOperations.Practice;

import java.util.Scanner;

public class BooleanOperations_3 {
    public static void main(String[] args) {
        //Шахматная доска
        //Вводятся координаты клетки от 1-8
        //Вывести цвет клетки

        Scanner scanner = new Scanner(System.in);
        System.out.println("CHESS!");
        System.out.println("введите число от 1 до 8 координаты х ");
        int x = scanner.nextInt();
        System.out.println("введите число от 1 до 8 координаты y ");
        int y = scanner.nextInt();
        scanner.close();

        chessCompare(x, y);
    }

    private static void chessCompare(int x, int y) {

        if (x % 2 != 0 && y % 2 != 0 || x % 2 == 0 && y % 2 == 0) {
            System.out.println("Это белая клетка");
        } else {
            System.out.println("Это чёрная клетка");
        }
    }
}
