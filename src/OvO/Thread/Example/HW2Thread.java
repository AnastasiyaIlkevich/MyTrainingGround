package OvO.Thread.Example;

public class HW2Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " START");
        NeuThread neuThread = new NeuThread();
        neuThread.start();
        System.out.println(Thread.currentThread().getName() + " FINISH");

    }
}


class NeuThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " START");

        for (int i = 0; i < 100; i++) {
            System.out.println( "A" + i);
        }
        System.out.println(Thread.currentThread().getName() + " FINISH");


    }

}
