package OvO.Thread.EextendsThread;

public class ThreadEx {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread + " -> thread");
        System.out.println(thread.getName() + " -> thread.getName()");
        System.out.println(thread.getPriority() + " -> thread.getPriority()");
        System.out.println(thread.getThreadGroup().getName() + "-> thread.getThreadGroup().getName()");

        System.out.println("_______________________________________________");
        System.out.println("Main thread started...");
        new MyThread("My Thread").start();

        for (int i = 1; i < 10; i++) {
            MyThread myThread = new MyThread("My Thread" + i);
            myThread.start();
            try {
                myThread.join();
            } catch (InterruptedException e) {
                System.err.printf("%s has been interrupted", myThread.getName());
            }
        }
        System.out.println("Main thread finished...");
    }
}
