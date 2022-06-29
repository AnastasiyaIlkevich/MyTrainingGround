package OvO.Integer.Practice;

import java.util.Scanner;

public class PracticeWithInteger_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        scanner.close();

      /*
    На вход подаётся некоторое число. Выведите количество десятков в этом числе.
    Количество десятков - предпоследнее число.
     */
        numberOfTens(number);
    /*
    На вход подаётся целое число. Вывести следующее за ним чётное.
    */
        evenNumber(number);
    }

    public static void evenNumber(int number) {
        //Вариант 1
        int del = number+2-number%2;
        System.out.println("Вариант 1 Следующее чётное число = " + del);


        //Вариант 2
        if (number % 2 != 0) {
            ++number;
            System.out.println("Вариант 2 Следующее чётное число = " + number);
        }else {
            number+=2;
            System.out.println("Вариант 2 Следующее чётное число = " + number);
        }
    }

    public static void numberOfTens(int number) {

        number/=10;
        int cuntTens = number%10;


        System.out.println("Количество десятков = " + cuntTens);

    }


}
