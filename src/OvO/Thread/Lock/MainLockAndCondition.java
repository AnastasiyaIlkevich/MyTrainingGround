package OvO.Thread.Lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock And Condition
 */

public class MainLockAndCondition {

    static Account account = new Account();

    public static void main(String[] args) {

        MyDeposit myDeposit = new MyDeposit();
        myDeposit.start();
        MyWithDraw myWithDraw = new MyWithDraw();
        myWithDraw.start();

    }

    static class MyWithDraw extends Thread {
        public void run() {
            try {
                account.withdraw(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class MyDeposit extends Thread {
        public void run() {
            account.deposit(1000);
        }
    }

    static class Account {

        Lock lock = new ReentrantLock();
        Condition newCondition = lock.newCondition(); //состояние

        int balance = 0;

        public void deposit(int amount) {
            lock.lock();
            try {
                Thread.sleep(1000); //IllegalMonitorStateException монитор ждёт
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance += amount;
            System.out.println("Balance is increased " + balance);
            newCondition.signal(); //newCondition.signal() по классике доложен срабатывать после newCondition.await()
            lock.unlock();

        }

        public void withdraw(int amount) throws InterruptedException {
            lock.lock(); //обязательно для избежания IllegalMonitorStateException
            while (amount > balance) {
                newCondition.await(); //может быть ошибка IllegalMonitorStateException если монитор ждёт
            }
            System.out.println("Balance before withdrawal " + balance);
            balance -= amount;
            System.out.println("Balance after withdrawal " + balance);
            lock.unlock();
        }
    }
}
