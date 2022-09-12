package OvO.Thread.Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Pool - позволяет создавать пул потоков которые используются по кругу в программе. Не создавая более 5
 */

public class MainPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5); //5 потоков в Pool
        for (int i = 0; i < 20; i++) {
            executorService.execute(new MyThread("A"));
            executorService.execute(new MyThread("B"));
            executorService.execute(new MyThread("C"));
            executorService.execute(new MyThread("D"));
            executorService.execute(new MyThread("E"));

        }
        executorService.shutdown();
    }
}

class MyThread extends Thread {

    String name;

    Semaphore semaphore = new Semaphore(5);// 5 потоков в semaphore

    public MyThread(String name) {
        this.name = name;
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