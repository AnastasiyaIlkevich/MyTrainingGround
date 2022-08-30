package OvO.Thread.ImplementsRunnable;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
/*        System.out.println("_______________________________________________");
        System.out.println("Main thread started...");

        Thread myThread = new Thread(new MyThread(), "MyThread");
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished...");
        System.out.println("_______________________________________________");*/


        System.out.println("_______________________________________________");
        System.out.println("Main thread started...");

        Runnable runnable = () -> {
            System.out.printf("%s started... \n", Thread.currentThread().getName());
            System.out.println(new Date());
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                System.err.println("Thread has been interrupted");
            }
            System.out.printf("%s fiished... \n", Thread.currentThread().getName());
        };
        Thread myThread = new Thread(new MyThread(), "MyThread");
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished...");
        System.out.println("_______________________________________________");
    }


}
