package OvO.Cycle.HW;

import java.util.Scanner;

public class CycleHomeWork {

    //На вход подаётся число.
    //Вывести сумму всех натуральных,
    //чётных чисел, находящихся до этого числа.
    //Пример ввода: 6
    //Вывод: 12

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num = scanner.nextInt();
        scanner.close();

        cycleWhile(num);
        cycleFori(num);
    }

    private static void cycleFori(int num) {
        int sum =0;
        for (int i = 1; i <= num; i++) {
            if (i%2==0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }

    private static void cycleWhile(int num) {
        int count = 1;
        int sum =0;
        while (num>=count){
            if (count%2==0){
                sum +=count;
            }
            ++count;
        }
        System.out.println(sum);
    }
}
