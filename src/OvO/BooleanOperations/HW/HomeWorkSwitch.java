package OvO.BooleanOperations.HW;

import java.util.Scanner;

public class HomeWorkSwitch {
    //Условие задачи
    //На ввод подаётся число. Выведите квадраты подряд идущих цифр, не превосходящих введённое число
    //Пример ввода: 37
    //Вывод: 1 4 9 16 25 36
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int number = scanner.nextInt();
        scanner.close();
        squaresOperator(number);
    }

    private static void squaresOperator(int number) {
        int beforeNumber =1;
        while (Math.pow(beforeNumber,2)<=number){
            System.out.print((int) Math.pow(beforeNumber,2)+" ");
            beforeNumber++;
        }
    }
}
