package OvO.Cycle.HW;

import java.util.Scanner;

public class MathHomeWork4 {
    public static void main(String[] args) {
        //На вход подаётся число n и число a.
        //Выберите случайное число из промежутка [-n; n] a раз.
        //Пример ввода: 12 5
        //Вывод: 1 7 -3 12 -10

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int first = scanner.nextInt();
        System.out.println("enter second number");
        int second = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < second; i++) {
            int random = (int) (Math.random() * (first+first)-first);
            System.out.print(random + " ");
        }

    }
}
