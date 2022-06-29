package OvO.Integer.HW;

import java.util.Scanner;

public class HomeWorkWithInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        scanner.close();

    /*
    На вход подаётся целое число. Вывести следующее за ним нечётное число.
    */
        evenNumber(number);
    }

    public static void evenNumber(int number) {
        int nextNum = number%2+number+1;
        System.out.println("Следующее нечётное число = " + nextNum);
    }
}
