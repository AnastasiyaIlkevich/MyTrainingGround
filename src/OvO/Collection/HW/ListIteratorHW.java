package OvO.Collection.HW;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListIteratorHW {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1000));
        }
        ListIterator<Integer> integerListIterator = list.listIterator();
        while (integerListIterator.hasNext()) {
            integerListIterator.next();
        }
        while (integerListIterator.hasPrevious()) {
            Object num = integerListIterator.previous();
            System.out.print(num + " ");
            integerListIterator.remove();
        }
    }
}
