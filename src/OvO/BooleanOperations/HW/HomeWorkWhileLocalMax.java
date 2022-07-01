package OvO.BooleanOperations.HW;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HomeWorkWhileLocalMax {

    //Условие задачи
    //Вывести все локальные максимумы в последовательности,
    //завершающейся нулём. Строгий локальный максимум,
    //определяется, если значение больше следующего и предыдущего.
    //Пример ввода: 1 2 1 2 1 0



    //Вывод: 2 (я так поняла нужно убрать повторяющиеся. Иначе вывод был бы 2,2)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int preNumber = scanner.nextInt();
        System.out.println("enter the number ");
        int number = scanner.nextInt();

        if (preNumber == 0 || number == 0) {
            System.out.println("no local max");
            System.exit(1);
        }

        Set<Integer> localMax = new HashSet<>();
        System.out.println("enter the number ");
        int postNumber = scanner.nextInt();
        while (postNumber != 0) {
            if (number > preNumber && number > postNumber) {
                localMax.add(number);
            }
            preNumber = number;
            number = postNumber;
            System.out.println("enter the number ");
            postNumber = scanner.nextInt();
        }
        System.out.println(localMax);
    }
}
