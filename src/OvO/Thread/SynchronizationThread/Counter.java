package OvO.Thread.SynchronizationThread;

public class Counter {

    private int number;

    public Counter(int number) {
        this.number = number;
    }

    public synchronized void count(){
       for (int i = 0; i < 2; i++) {
          System.out.println(Thread.currentThread().getName() + " -> "+--number);
       }
    }
}
