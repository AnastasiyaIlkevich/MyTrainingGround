package OvO.Thread.Semaphore;

import java.util.concurrent.Semaphore;

/**
 * Semaphore - может одновременно работать с кодом то количество потоков что заданно в Semaphore
 */
public class MainSemaphore {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(4);
        for (int i = 0; i < 10; i++) {
            CheckSemaphore checkSemaphore = new CheckSemaphore(Thread.currentThread().getName() + " -> " + i, semaphore);
            checkSemaphore.start();
        }

    }
}

class CheckSemaphore extends Thread {

    String name;
    Semaphore semaphore;

    public CheckSemaphore(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            semaphore.acquire();// точка начала работы симафора
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " start");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finish");
        semaphore.release(); //точка окончания работы симафора
    }
}