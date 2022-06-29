package OvO.BooleanOperations.HW;

import java.util.Scanner;

public class HomeWorkBooleanOperations_5 {

    //На вход подаётся 5 чисел. Первая двойка - цена килограмма картошки
    // в рублях и копейках. Вторая двойка - имеющиеся с собой деньги.
    // Третье число - нужное количество килограммов. Необходимо узнать,
    // хватит ли денег на покупку.
    //Пример ввода: 2 20 3 40 1.
    //Вывод: хватит.
    //Пример ввода: 2 0 2 4 2.
    //Вывод: не хватит.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите цену в рублях: ");
        int priceRub = scanner.nextInt();
        System.out.println("введите цену в копейках: ");
        int pricePenni = scanner.nextInt();
        System.out.println("введите количество рублей:");
        int myRubles = scanner.nextInt();
        System.out.println("введите количество копеек:");
        int myPennies = scanner.nextInt();
        System.out.println("введите количество килограмм ");
        int numberKg = scanner.nextInt();
        scanner.close();

        countingMoney(priceRub, pricePenni, myRubles, myPennies, numberKg);
    }

    private static void countingMoney(int priceRub, int pricePenni, int myRubles, int myPennies, int numberKg) {

        pricePenni += priceRub * 100;
        myPennies += myRubles * 100;

        if (myPennies - pricePenni * numberKg >= 0) {
            System.out.println("хватит");
        } else
            System.out.println("не хватит");
    }
}

