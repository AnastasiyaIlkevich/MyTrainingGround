package OvO.Cycle.Practice;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        //которая считает н факториал от 1 до н
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        long fact = 1;

        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
