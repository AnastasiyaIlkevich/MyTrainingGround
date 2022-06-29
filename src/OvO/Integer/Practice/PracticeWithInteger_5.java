package OvO.Integer.Practice;

import java.util.Scanner;

public class PracticeWithInteger_5 {

    public static void main(String[] args) {
        //На вход подается две переменные.
        // В первой задаётся скорость в км/ч. Во второй время в
        // часах, затраченое на путь при этой скорости. Найти расстояние
        //ввод 100 2
        //вывод 200

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of speed");
        int speed = scanner.nextInt();
        System.out.println("please enter quantity of time");
        int time = scanner.nextInt();
        scanner.close();

        distance(speed, time);


    }

    private static void distance(int speed, int time) {
        int distance = speed * time;
        System.out.println("Пройденае рассояние " + distance);
    }


}
