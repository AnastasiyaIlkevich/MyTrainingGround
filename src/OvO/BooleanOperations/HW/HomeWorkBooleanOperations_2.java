package OvO.BooleanOperations.HW;

import java.util.Scanner;

public class HomeWorkBooleanOperations_2 {
    public static void main(String[] args) {
        //На входе подаётся три числа.
        //Ожидается, что одно из них нечётное.
        //Вывести номер нечётного.
        //Пример ввода: 2 6 7.
        //Вывод: 3.

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
        int a = scanner.nextInt();
        System.out.println("введите второе число");
        int b = scanner.nextInt();
        System.out.println("введите третье число");
        int c = scanner.nextInt();
        scanner.close();

        compare(a, b);
    }

    private static void compare(int a, int b) {

        if (a % 2 != 0) {
            System.out.println("1 число нечётное");
        } else if (b % 2 != 0) {
            System.out.println("2 число нечётное");
        } else {
            System.out.println("3 число нечётное");
        }
    }
}

