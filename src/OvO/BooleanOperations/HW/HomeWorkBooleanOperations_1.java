package OvO.BooleanOperations.HW;

import java.util.Scanner;

public class HomeWorkBooleanOperations_1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Даны три целых числа. Определите, сколько среди
        // них совпадающих. Программа должна вывести одно
        // из чисел: 3 (если все совпадают), 2 (если два совпадает)
        // или 0 (если все числа различны).
        compare();


        //Шахматная ладья ходит по горизонтали или вертикали.
        //Даны две различные клетки шахматной доски, определите,
        //может ли ладья попасть с первой клетки на вторую одним ходом.
        chess();
    }

    private static void chess() {
        System.out.println("CHESS!");
        System.out.println("введите число от 1 до 8 координаты х для ладьи");
        int xLady = scanner.nextInt();
        System.out.println("введите число от 1 до 8 координаты y для ладьи");
        int yLady = scanner.nextInt();
        System.out.println("введите число от 1 до 8 координаты х для пустой клетки");
        int x = scanner.nextInt();
        System.out.println("введите число от 1 до 8 координаты y для пустой клетки");
        int y = scanner.nextInt();
        scanner.close();

        chessCompare(xLady, yLady, x, y);
    }

    private static void chessCompare(int xLady, int yLady, int x, int y) {
        if (x == xLady || y == yLady) {
            System.out.printf("Ладья может попасть в клетку %d-%d одним ходом", x, y);
        } else {
            System.out.printf("Ладья НЕ МОЖЕТ попасть в клетку %d-%d одним ходом", x, y);
        }
    }

    private static void compare() {

        System.out.println("Number comparison program!");
        System.out.println("Please enter the first number");
        int first = scanner.nextInt();
        System.out.println("Please enter the second number");
        int second = scanner.nextInt();
        System.out.println("Please enter the third number");
        int third = scanner.nextInt();

        if (first == second && first == third) {
            System.out.println("3");
        } else if (first == second || first == third || third == second) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}
