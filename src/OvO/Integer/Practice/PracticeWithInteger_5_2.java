package OvO.Integer.Practice;

import java.util.Scanner;

public class PracticeWithInteger_5_2 {
    public static void main(String[] args) {
        //На вход подается две 3 числа. Растояние от точки а
        // до б в км. Скорость катера. Скорость течения в км/ч.
        //найти время движения из точки а в б и обратно.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of speed ship");
        int speedShip = scanner.nextInt();
        System.out.println("please enter quantity of distance");
        int distance = scanner.nextInt();
        System.out.println("please enter quantity of speed sea");
        int speedSea = scanner.nextInt();
        scanner.close();

        time(speedSea, speedShip, distance);
    }

    private static void time(int speedSea, int speedShip, int distance) {

        int time = distance / (speedSea + speedShip);
        time += distance / (speedShip - speedSea);
        System.out.println("Время на движение катера туда и обратно составляет " + time);

    }

}
