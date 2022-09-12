package OvO.Thread.Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Pool - позволяет создавать пул потоков которые используются по кругу в программе. Не создавая более 5
 */

public class MainPool {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);// 5 потоков в semaphore
        ExecutorService executorService = Executors.newFixedThreadPool(5); //5 потоков в Pool
        for (int i = 0; i < 20; i++) {
            executorService.execute(new MyThread("A",semaphore));
            executorService.execute(new MyThread("B",semaphore));
            executorService.execute(new MyThread("C",semaphore));
            executorService.execute(new MyThread("D",semaphore));
            executorService.execute(new MyThread("E",semaphore));

        }
        executorService.shutdown();
    }
}

class MyThread extends Thread {

    String name;

    Semaphore semaphore;

    public MyThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("start " + name);
        for (int i = 0; i < 1; i++) {
            System.out.println(name + i);
        }
        System.out.println("finish " + name);
        semaphore.release();
    }
}