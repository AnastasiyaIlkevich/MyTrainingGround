package OvO.ClassOOP.ClassQuadraticEquation;

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


        qe.setRoot(qe.discriminantCalculation());
        System.out.println(qe);
    }
}
