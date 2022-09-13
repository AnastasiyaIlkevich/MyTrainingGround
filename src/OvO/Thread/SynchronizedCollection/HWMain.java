package OvO.Thread.SynchronizedCollection;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HWMain {
    public static void main(String[] args) {
        //Создайте параллельную коллекцию из n чисел и пул из
        // 3-ёх потоков. Необходимо увеличить элементы
        // коллекции на 10. Использовать вышеперечисленные конструкции.
        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) (Math.random() * 10));
        }

        List<Integer> synchronizedList = Collections.synchronizedList(listNum);
        System.out.println(synchronizedList);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 100; i++) {
            executorService.execute(new MyThread(synchronizedList));
        }
        executorService.shutdown();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(synchronizedList);
    }
}

class MyThread extends Thread {

    List<Integer> synchronizedList;

    public MyThread( List<Integer> conditionSynch) {

        this.synchronizedList = conditionSynch;
    }

    public void run() {
        synchronized (synchronizedList){
            for (int i = 0; i < synchronizedList.size(); i++) {
                synchronizedList.set(i, synchronizedList.get(i) + 10);
            }
        }

    }
}