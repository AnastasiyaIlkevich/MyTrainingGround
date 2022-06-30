package OvO.BooleanOperations.HW;

import java.util.Scanner;

public class HomeWorkWhile_2 {
    public static void main(String[] args) {
        //Напишите программу, которая возводит число в любую целую степень.
        //Первое число, то которое нужно возвести. Второе — степень.
        //Пример ввода: 1-1 Пример ввода: 2-1
        //Вывод: 1 Вывод: 0.5

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int number = scanner.nextInt();
        System.out.println("enter the power ");
        int power = scanner.nextInt();
        scanner.close();
        numberToPower(number, power);
    }

    private static void numberToPower(int number, int power) {
        int temp = 0;
        if (number != 0) {
            temp = number;
        } else {
            System.exit(1);
        }

        if (power > 0) {
            while (power != 1) {
                number = number * temp;
                --power;
            }
            System.out.println(number);
        } else if (power < 0) {
            while (power != -1) {
                number = number * temp;
                ++power;
            }
            double number2 = (double) 1 / number;
            System.out.println(number2);
        } else if (power == 0) {
            System.out.println(1);
        }
    }
}
