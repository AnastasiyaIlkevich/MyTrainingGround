package OvO.BooleanOperations.Practice;

import java.util.Scanner;

public class BooleanOperations_4 {
    public static void main(String[] args) {
        //подаётся два числа
        // вывести большее
        //если равны вывести любое
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число х ");
        int x = scanner.nextInt();
        System.out.println("введите число  y ");
        int y = scanner.nextInt();
        scanner.close();

        сompare(x, y);
    }

    private static void сompare(int x, int y) {

        if (x>=y){
            System.out.println(x);
        }else {
            System.out.println(y);
        }
    }
}
