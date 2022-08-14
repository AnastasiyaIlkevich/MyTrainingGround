package OvO.Lambda;

import java.util.Scanner;

public class LambdaEx1 {

    // сложение двух чисел с помощью Lambda

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operation1 operation = (int a, int b) -> {
            System.out.println(a + b);
        };

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        operation.sum(a, b);
    }

}
