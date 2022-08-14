package OvO.Lambda;

import java.util.Scanner;

public class LambdaEx3 {
    public static void main(String[] args) {
        Operation3 operation = (char ch, double firstNumber, double secondNumber) -> {
            if (ch == '+') {
                System.out.println(firstNumber + secondNumber);
            } else if (ch == '-') {
                System.out.println(firstNumber - secondNumber);
            } else if (ch == '*') {
                System.out.println(firstNumber * secondNumber);
            } else if (ch == '/') {
                System.out.println(firstNumber / secondNumber);
            }
        };

        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        char ch = scanner.nextLine().charAt(0);

        operation.calculator(ch, firstNumber, secondNumber);
    }

}
