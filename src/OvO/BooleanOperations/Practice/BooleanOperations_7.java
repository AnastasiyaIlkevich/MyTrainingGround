package OvO.BooleanOperations.Practice;

import java.util.Scanner;

public class BooleanOperations_7 {
    // на вход подаётся число
//    оот 1 до 999
//    вывести разрядность
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
        int number = scanner.nextInt();
        scanner.close();
        compare(number);
    }

    private static void compare(int number) {
        number /= 10;
        if (number <= 0) {
            System.out.println("Однозначное число");
        } else if (number <= 9) {
            System.out.println("двухзначное число");
        } else {
            System.out.println("трёхзначное число");
        }
    }
}
