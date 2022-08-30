package OvO.Thread.ImplementsRunnable;

import java.util.Date;

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        System.out.println(new Date());
        try{
            Thread.sleep(500);
        } catch (InterruptedException exception){
            System.err.println("Thread has been interrupted");
        }
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}
