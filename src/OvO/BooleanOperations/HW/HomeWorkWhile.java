package OvO.BooleanOperations.HW;

import java.util.Scanner;

public class HomeWorkWhile {
    public static void main(String[] args) {
        //Найдите самый большой натуральный делитель.
        //На вход подаётся одно число. Делитель должен
        //быть отличен от самого числа.
        //Пример ввода: 16
        //Вывод: 8

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int number = scanner.nextInt();
        scanner.close();
        maxDivisor(number);
    }

    private static void maxDivisor(int number) {

        int count = number-1;
        while (count>=1){
            if (number%count==0){
                break;
            }else --count;
        }
        System.out.println(count);
    }
}
