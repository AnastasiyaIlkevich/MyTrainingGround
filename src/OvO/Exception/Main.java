package OvO.Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Start");
        division();
        System.out.println("End");

    }

    private static void division() {
        boolean ifResult = false;
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Enter first number");
        int firstNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number");
        int second = Integer.parseInt(scanner.nextLine());
            int result = firstNum / second;
            ifResult = true;
            System.out.println("result -> " + result);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("You can't divide by zero!");
        } catch (NumberFormatException formatException) {
            System.out.println("You entered the wrong number!");
        } finally {
            if (!ifResult) {
                division();
            }else {
                scanner.close();
            }
        }
    }
}



