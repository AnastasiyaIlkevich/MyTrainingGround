package OvO.Integer.HW;

import java.util.Scanner;

public class HomeWorkWithInteger_3 {

    public static void main(String[] args) {

        //Условие задачи
        //На вход по даётся расстояние, в километрах и
        // скорость в километрах в час, найти время, затраченное на путь.
        //Пример ввода: 150 50
        //Вывод: 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the speed of transport-> ");
        int speed = scanner.nextInt();
        System.out.println("Please enter distance-> ");
        int distance = scanner.nextInt();
        scanner.close();

        time(speed,distance);
    }

    private static void time(int speed, int distance) {

        int time = distance/speed;
        if (time<= 1){
            System.out.printf("Time -> %d hour",time);
        }else {
            System.out.printf("Time -> %d hours",time);
        }
    }
}
