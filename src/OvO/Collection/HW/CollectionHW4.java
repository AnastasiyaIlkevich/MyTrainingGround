package OvO.Collection.HW;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionHW4 {

    public static void main(String[] args) {
        //Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 5".
        Scanner scanner = new Scanner(System.in);
        //Избавиться от повторяющихся элементов в строке.
        Set<Integer> setInt = new HashSet<>();
        for (String i : scanner.nextLine().split(",")) {
            setInt.add(Integer.valueOf(i));
        }
        //Вывести результат на экран.
        System.out.println(setInt);
    }
}
