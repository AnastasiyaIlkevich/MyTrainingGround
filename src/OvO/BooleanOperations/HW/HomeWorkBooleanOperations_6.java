package OvO.BooleanOperations.HW;

import java.util.Scanner;

public class HomeWorkBooleanOperations_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("первое число ");
        int a = scanner.nextInt();
        System.out.println("второе число ");
        int b = scanner.nextInt();
        System.out.println("третье число");
        int c = scanner.nextInt();
        scanner.close();

        compare(a, b, c);
    }

    private static void compare(int a, int b, int c) {

        int temp;
        if (b >= c) {
            temp = c;
            c = b;
            b = temp;
        }
        if (a >= b) {
            temp = b;
            b = a;
            a = temp;
        }
        if (b >= c) {
            temp = c;
            c = b;
            b = temp;
        }
        System.out.printf("%d, %d, %d", a, b, c);
    }
}
