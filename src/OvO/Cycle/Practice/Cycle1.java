package OvO.Cycle.Practice;

import java.util.Scanner;

public class Cycle1 {
    //на вход подаётся число. Вывести кубы чисел до введённорго (включительно)
    //5
    //1 8 27 64 125

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print((int) Math.pow(i, 3)+ " ");
        }
    }
}
