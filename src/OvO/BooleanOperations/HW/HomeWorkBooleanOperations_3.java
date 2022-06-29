package OvO.BooleanOperations.HW;

import java.util.Scanner;

public class HomeWorkBooleanOperations_3 {
    public static void main(String[] args) {

        //На вход подаются три числа: x, y, z.
        //Определите, могут ли эти числа быть длинами сторон прямоугольного треугольника.
        //Пример ввода: 3, 4, 5.
        //Пример ввода: 1, 2, 3.
        //Пример вывода: может быть.
        //Пример вывода: не может быть.

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число х ");
        int x = scanner.nextInt();
        System.out.println("введите число y ");
        int y = scanner.nextInt();
        System.out.println("введите число z ");
        int z = scanner.nextInt();
        scanner.close();

        compare(x, y, z);

    }

    private static void compare(int x, int y, int z) {

        boolean triangle = false;
        if (x > y && x > z) {
            triangle = (Math.pow(x, 2) == Math.pow(y, 2) + Math.pow(z, 2));
        } else if (y > x && y > z) {
            triangle = (Math.pow(y, 2) == Math.pow(x, 2) + Math.pow(z, 2));
        } else if (z > x && z > y) {
            triangle = (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2));
        }

        if (triangle) {
            System.out.println("может быть");
        } else {
            System.out.println("не может быть");
        }
    }
}
