package OvO.ClassOOP.ClassCircle;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle -> ");
        Circle circle = new Circle(scanner.nextDouble());
        System.out.println(circle);
    }
}
