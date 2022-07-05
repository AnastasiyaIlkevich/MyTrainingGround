package OvO.Cycle.HW;

import java.util.Scanner;

public class CycleHomeWork2 {
    public static void main(String[] args) {
        //На вход подаётся два числа. Первое - само число. Второе - степень, в которую нужно его возвести.
        //Пример ввода: 3 3
        //Вывод: 27

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        byte num = scanner.nextByte();
        System.out.println("enter power of number");
        byte power = scanner.nextByte();
        scanner.close();

        long productNumber = num;
        for (int i = 1; i < power; i++) {
            productNumber = productNumber * num;
        }
        System.out.println(productNumber);
    }
}
