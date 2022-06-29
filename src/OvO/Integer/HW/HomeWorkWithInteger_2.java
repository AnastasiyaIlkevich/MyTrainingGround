package OvO.Integer.HW;

import java.util.Scanner;

public class HomeWorkWithInteger_2 {

    public static void main(String[] args) {

        //Условие задачи
        //На ввод подаётся четырёхзначное число.
        //1000 - пример четырёхзначного числа.
        // Выведите сумму цифр этого числа.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1000 and 9999");
        int number = scanner.nextInt();
        scanner.close();

        sumFourDigitNumber(number);
    }

    private static void sumFourDigitNumber(int number) {
        int sum = (number / 1000) + (number % 1000 / 100) + (number % 100 / 10) + (number % 10);
        System.out.println("Sum of a four-digit number = " + sum);
    }
}
