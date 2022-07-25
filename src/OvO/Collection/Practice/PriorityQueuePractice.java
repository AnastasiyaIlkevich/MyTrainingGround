package OvO.Collection.Practice;

import java.util.*;

public class PriorityQueuePractice {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            Integer rand = random.nextInt(100);
            queue.add(rand);
            System.out.print(rand + ", ");
        }
        System.out.println();
        System.out.println(queue.size());
        System.out.println(queue);
        int avg = 0;
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            avg+= iterator.next();
        }
        int avg2 = 0;
       avg2 = avg2+queue.peek();
        avg2 = avg2+queue.peek();
        avg2 = avg2+queue.peek();
//        while (!queue.isEmpty()) {
//            avg2+= queue.peek();
//        }
        int avg3 = 0;
        while (!queue.isEmpty()) {
            avg3+= queue.poll();
        }
        System.out.println(avg);
        System.out.println(avg2);
        System.out.println(avg3);
        System.out.println(queue);
    }
}
