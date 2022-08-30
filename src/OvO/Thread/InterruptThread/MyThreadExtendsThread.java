package OvO.Thread.InterruptThread;

public class MyThreadExtendsThread extends Thread {

    MyThreadExtendsThread(String name){
        super(name);
    }
    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        while(!isInterrupted()){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.err.println("Thread has been interrupted");
                break;
            }
            System.out.println("Loop " + counter++);
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
