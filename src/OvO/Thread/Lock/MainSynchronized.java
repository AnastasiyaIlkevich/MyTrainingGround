package OvO.Thread.Lock;

/**
 * Synchronized
 */

public class MainSynchronized {

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
        int balance = 0;

        public synchronized void deposit(int amount) {
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance += amount;
            notify();
            System.out.println("Balance is increased " + balance);
        }

        public synchronized void withdraw(int amount) throws InterruptedException {
            while (amount > balance) {
                wait();
            }
            System.out.println("Balance before withdrawal " + balance);
            balance -= amount;
            System.out.println("Balance after withdrawal " + balance);
        }
    }
}
