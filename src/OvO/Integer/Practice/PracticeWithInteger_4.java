package OvO.Integer.Practice;

import java.util.Scanner;

public class PracticeWithInteger_4 {

    public static void main(String[] args) {

        //Сколько нужно парт для учеников трёх классов.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number child in 1 class");
        int n = scanner.nextInt();
        System.out.println("Please enter the number child in 2 class");
        int k = scanner.nextInt();
        System.out.println("Please enter the number child in 3 class");
        int z = scanner.nextInt();
        scanner.close();

        parta(n, k, z);
    }

    private static void parta(int n, int k, int z) {

        int numberPart = n / 2 + n % 2 + k / 2 + k % 2 + z / 2 + z % 2;
        System.out.println("Количество парт = " + numberPart);

    }


}
