package OvO.Thread.InterruptThread;

public class MyThreadIsActive implements Runnable{

    private boolean isActive;


    @Override
    public void run() {
        isActive = true;
        System.out.println("start -> " + Thread.currentThread().getName());
        int count = 1;
        while (isActive){
            System.out.println("Loop " + count++ + " " + Thread.currentThread().getName());
         //   try {
         //       Thread.sleep(400);
          //  } catch (InterruptedException e) {
           //     System.err.println("Thread has been interrupted");
          //  }
        }
        System.out.println("finish -> " + Thread.currentThread().getName());

    }

    void disable(){
        isActive = false;
    }

}
