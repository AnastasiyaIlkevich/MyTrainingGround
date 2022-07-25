package OvO.Collection.HW;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueHW {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Integer rand = random.nextInt(100);
            queue.add(rand);
        }
        System.out.println(queue.size());

        int avg = 0;
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            avg+= iterator.next();
        }
        System.out.println((double)avg/ queue.size());
    }
}
