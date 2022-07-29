package OvO.Collection.HW;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class CollectionHW5 {

    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < 100; i++) {
          set.add(random.nextInt(1000));
        }
        Iterator<Integer> iterator = set.iterator();
        set.removeIf(integer -> integer % 2 != 0);
//        while (iterator.hasNext()){
//            if (iterator.next()%2!=0){
//                iterator.remove();
//            }
//        }
        System.out.println(set);
    }
}
