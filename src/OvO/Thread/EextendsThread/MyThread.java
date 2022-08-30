package OvO.Thread.EextendsThread;

import java.util.Date;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run(){
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
