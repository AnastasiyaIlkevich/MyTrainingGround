package OvO.BooleanOperations.HW;

import java.util.Scanner;

public class HomeWorkBooleanOperations_4 {
    //На вход подаётся 6 чисел. Первые два - это количество минут
    // и часов текущего времени. Вторые два - время, к которому
    // вам нужно успеть на работу. Третья двойка - время в минутах,
    // за которое нужно добраться до работы. Необходимо узнать,
    // успеете ли вы к нужному времени на работу.
    //Пример ввода: 8 0 9 0 1 20.
    //Вывод: не успеете.
    //Пример ввода: 8 25 9 10 1 10.
    //Вывод: не успеете.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество часов текущего времени :");
        int hoursHouse = scanner.nextInt();
        System.out.println("введите количество минут текущего времени :");
        int minutesHouse = scanner.nextInt();
        System.out.println("введите часы начала рабочего дня: ");
        int hoursWork = scanner.nextInt();
        System.out.println("введите минуты начала рабочего дня: ");
        int minutesWork = scanner.nextInt();
        System.out.println("введите часы дороге до работы: ");
        int hoursTravel = scanner.nextInt();
        System.out.println("введите минуты дороге до работы: ");
        int minutesTravel = scanner.nextInt();
        scanner.close();

        compare(timing(hoursHouse, minutesHouse, hoursWork, minutesWork, hoursTravel, minutesTravel));
    }

    private static void compare(int timing) {
        if (timing>=0){
            System.out.println("Успеете");
        } else {
            System.out.println("НЕ УСПЕЕТЕ");
        }
    }

    private static int timing(int hoursHouse, int minutesHouse, int hoursWork, int minutesWork, int hoursTravel, int minutesTravel) {
        minutesHouse += hoursHouse * 60;
        minutesWork += hoursWork * 60;
        minutesTravel += hoursTravel * 60;

        return minutesWork - minutesHouse - minutesTravel;
    }

}
