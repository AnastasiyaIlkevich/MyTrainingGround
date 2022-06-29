package OvO.BooleanOperations.Practice;

import java.util.Scanner;

public class BooleanOperations_10 {
    //Бьёт ли слон фигуру
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CHESS!");
        System.out.println("введите число от 1 до 8 координаты х для слона");
        int x1 = scanner.nextInt();
        System.out.println("введите число от 1 до 8 координаты y для слона");
        int y1 = scanner.nextInt();
        System.out.println("введите число от 1 до 8 координаты х для 2 фигуры");
        int x2 = scanner.nextInt();
        System.out.println("введите число от 1 до 8 координаты y для 2 фигуры");
        int y2 = scanner.nextInt();
        scanner.close();

        chessCompare(x1, y1, x2, y2);
    }

    private static void chessCompare(int x1, int y1, int x2, int y2) {

//        int z1 = Math.abs(x1-x2);
//        int z2 = Math.abs(y1-y2);

        int z1 = (x1 + x2);
        int z2 = (y1 + y2);

        if (z1 == z2) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}
