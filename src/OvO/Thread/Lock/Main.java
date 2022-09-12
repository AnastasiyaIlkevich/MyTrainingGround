package OvO.Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    /**
     * Lock (blocking)
     */

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();

        Thread thread1 = new Thread(myThread);
        thread1.start();
        Thread thread2 = new Thread(myThread);
        thread2.start();

        Thread.sleep(1000);

        System.out.println(myThread.getX());

    }

}

class MyThread extends Thread {

    int x = 0;

    Lock lock = new ReentrantLock(); //Lock lock = new ReentrantLock() - create a Lock object from ReentrantLock()

    @Override
    public void run() {
        lock.lock(); //lock.lock() - start blocking
        for (int i = 0; i < 10000; i++) {
            x++;
        }
        lock.unlock();//lock.unlock() - finish blocking
    }

    public int getX() {
        return x;
    }
}