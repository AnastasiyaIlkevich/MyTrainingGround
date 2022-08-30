package OvO.Thread.InterruptThread;

public class Runner {
    public static void main(String[] args) {


        System.out.println("Main started_________________");


        //ручное прерывание while
/*        MyThreadIsActive myThreadIsActive = new MyThreadIsActive();
        new Thread(myThreadIsActive,"MyThread").start();
        new Thread(myThreadIsActive,"MyThread 2").start();
        try {
            Thread.sleep(20);
            myThreadIsActive.disable();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Thread has been interrupted");
        }*/

        //прерывание методом interrupt
        MyThreadExtendsThread t = new MyThreadExtendsThread("JThread");
        t.start();
        // Thread thread = new Thread(new MyThreadExtendsThread("myThread"));
        try {
            Thread.sleep(1000);
            t.interrupt();
        } catch (InterruptedException e) {
            System.err.println("Thread has been interrupted");
        }


        System.out.println("Main finished_________________");
    }
}
