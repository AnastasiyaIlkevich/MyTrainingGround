package OvO.Thread.Example;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LibraryMain {

    static Librarian librarian = new Librarian();

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(7);
        for (int i = 0; i < 60; i++) {
            Thread thread = new Library(semaphore);
            thread.start();
        }
    }

    static class Library extends Thread {

        Semaphore semaphore;

        public Library(Semaphore semaphore) {
            this.semaphore = semaphore;
        }


        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName() + " читатель пришёл");
            System.out.println(Thread.currentThread().getName() + " читатель ждёт книги");
            try {
                librarian.getBook();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " читатель ищет место");
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " Читатель садится");
            System.out.println(Thread.currentThread().getName() + " читатель читает");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaphore.release();
            librarian.setBook();
            System.out.println(Thread.currentThread().getName() + " читатель уходит");

        }

    }

    static class Librarian {
        Lock lock = new ReentrantLock();
        Condition newCondition = lock.newCondition();
        int book = 100;

        public void setBook() {
            lock.lock();
            this.book += 3;
            System.out.println(Thread.currentThread().getName() + " читатель сдаёт книги");
            System.out.println("______________________ " + book);
            newCondition.signal();
            lock.unlock();
        }

        public void getBook() throws InterruptedException {
            lock.lock();
            while (this.book <= 2) {
                newCondition.await();
            }
            System.out.println(Thread.currentThread().getName() + " библиотекарь выдаёт 3 книги");
            this.book -= 3;
            System.out.println("______________________ " + book);

            lock.unlock();
        }
    }
}