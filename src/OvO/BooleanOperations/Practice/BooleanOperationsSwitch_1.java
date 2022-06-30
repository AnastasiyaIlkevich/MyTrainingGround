package OvO.BooleanOperations.Practice;

import java.util.Scanner;

public class BooleanOperationsSwitch_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number ");
        int firstNumber = scanner.nextInt();
        System.out.println("enter the second number ");
        int secondNumber = scanner.nextInt();
        System.out.println("enter the operator sign (+, -, *, /) ");
        char sing = scanner.next().charAt(0);
        scanner.close();

        calculator(firstNumber, secondNumber, sing);
    }

    private static void calculator(int firstNumber, int secondNumber, char sing) {

        switch (sing) {
            case '+' -> System.out.println("answer -> " + (firstNumber + secondNumber));
            case '-' -> System.out.println("answer -> " + (firstNumber - secondNumber));
            case '*' -> System.out.println("answer -> " + (firstNumber * secondNumber));
            case '/' -> System.out.println("answer -> " + (firstNumber / secondNumber));
            default -> System.out.println("invalid input data");
        }
    }
}
