package OvO.BooleanOperations.Practice;

import java.util.Scanner;

public class BooleanOperations_2 {
    public static void main(String[] args) {

        // на вход два числа а и б.
        //определить чётное первое число и если чётное и делится на 2
        //ывывести слово успех иначе неуспех

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
        int a = scanner.nextInt();
        System.out.println("введите второе число");
        int b = scanner.nextInt();

        compare(a, b);

    }

    private static void compare(int a, int b) {
        if (a % 2 == 0) {
            System.out.println("1 число чётное");
            if (a % b == 0) {
                System.out.println("Успех");
            } else {
                System.out.println("Не успех");
            }
        } else {
            System.out.println("1 число не чётное");
        }
    }
}
