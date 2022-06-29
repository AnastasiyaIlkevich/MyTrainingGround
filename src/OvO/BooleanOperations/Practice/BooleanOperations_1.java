package OvO.BooleanOperations.Practice;

import java.security.Signature;
import java.util.Scanner;

public class BooleanOperations_1 {

    // на вход подаётся 3 числа.
//    одно из них чётное
//            Вывести номер введённого числа

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
        int a = scanner.nextInt();
        System.out.println("введите второе число");
        int b = scanner.nextInt();
        System.out.println("введите 3 число");
        int c = scanner.nextInt();
        scanner.close();

        compare(a, b, c);
    }

    private static void compare(int a, int b, int c) {

        if (a % 2 == 0) {
            System.out.println("1 число чётное");
        } else if (b % 2 == 0) {
            System.out.println("2 число чётное");
        } else if ((c % 2 == 0)) {
            System.out.println("3 число чётное");
        } else {
            System.out.println("вы не ввели чётное число");
        }
    }
}
