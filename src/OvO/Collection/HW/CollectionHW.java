package OvO.Collection.HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CollectionHW {
    //Необходимо создать ArrayList из целых чисел.
    // Затем следует перебрать коллекцию, если число чётное,
    // добавить его в список с чётными числами, если нечетное
    // - в список с нечётными числами соответственно.
    // Вывести оба списка на экран, использовать метод
    // для нахождения числа элементов в списке и сравнить, какой список больше.

    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        List<Integer> listEvenNumbers = new ArrayList<>();
        List<Integer> listOddNumbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            listNumber.add(random.nextInt(100));
        }

        Iterator<Integer> iterator = listNumber.iterator();
        int num;
        while (iterator.hasNext()) {
            num = iterator.next();
            if (num % 2 != 0)
                listOddNumbers.add(num);
            else
                listEvenNumbers.add(num);
        }

        System.out.println(listOddNumbers);
        System.out.println(listEvenNumbers);

        System.out.println(check(listEvenNumbers, listOddNumbers));
    }

    private static String check(List<Integer> listEvenNumbers, List<Integer> listOddNumbers) {
        if (listEvenNumbers.size() > listOddNumbers.size())
            return "Even numbers > Odd numbers";
        else
            return "Even numbers < Odd numbers";
    }
}
