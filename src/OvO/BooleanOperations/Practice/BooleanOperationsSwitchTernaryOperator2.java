package OvO.BooleanOperations.Practice;

import java.util.Scanner;

public class BooleanOperationsSwitchTernaryOperator2 {
    //даётся число. Определите положительное или отрецательное
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int firstNumber = scanner.nextInt();

        scanner.close();

        operator(firstNumber);
    }

    private static void operator(int firstNumber) {
        switch (firstNumber) {
            case 0:
                System.out.println("null");
                System.exit(1);
                break;
        }
        System.out.println(firstNumber > 0 ? "Положительное" : "Отрецательное");
    }
}


