package OvO.ClassOOP.HW.ClassQuadraticEquation;

import java.util.Scanner;

public class Runner {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number a ");
        int a = scanner.nextInt();
        System.out.println("Enter number b");
        int b = scanner.nextInt();
        System.out.println("Enter number c");
        int c = scanner.nextInt();
        scanner.close();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);

        int disc = qe.discriminantCalculation();

        if (disc == 0) {
            System.out.println(disc + " =0");
        } else if (disc > 0) {
            System.out.println(disc + " >0");
        } else {
            System.out.println(disc + " <0");
        }
    }
}
