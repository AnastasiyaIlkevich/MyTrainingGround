package OvO.Integer.HW;

import java.util.Scanner;

public class HomeWork_1 {

    public static void main(String[] args) {

        /*
        Пусть на ввод с клавиатуры дается буква П,
        нужно с помощью арифметической операции вывести
        букву "Я". (Используйте таблицу Unicode)
        */
        letterConversion();

        /*
        Путешественник задумал путешествие на автомобиле. На ввод
        подается время в минутах, за которое он должен проехать
        дистанцию, и сама дистанция в километрах. Требуется найти
        необходимую скорость в км/ч.
        */
        carSpeed();


    }

    public static void carSpeed() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter travel time");
        int time = scanner.nextInt();
        System.out.println("please enter the travel distance");
        int distance = scanner.nextInt();
        double rideTimeInHours = (double) time / 60;
        double speed = distance / rideTimeInHours;
        System.out.println(speed);
        scanner.close();
    }


    public static void letterConversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the letter \"П\"");
        char inputLetter = scanner.next().charAt(0);
        System.out.println(inputLetter += 16);
    }
}
