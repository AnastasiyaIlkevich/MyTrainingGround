package OvO.Thread.Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner1 {

    //Задача 1. Создайте пул из 3-ёх потоков, которые 10 раз выводят своё имя в консоль.
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " -> " + Thread.currentThread().getName()+"    "+Thread.currentThread().getId());

//                try {
//                    Thread.sleep(1000+Math.round(Math.random()*1000));
//                } catch (InterruptedException e) {
//                    System.err.println("InterruptedException");
//                }
            }
        };

        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
            executorService.execute(thread);
        }

        executorService.shutdown();
    }

}
