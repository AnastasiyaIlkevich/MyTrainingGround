package OvO.Thread.MyExThread;

public class Main {

    /**
     work on one thread!!!
     **/

    public static void main(String[] args) {

          ThreadEx2 threadEx2 = new ThreadEx2();

          Thread thread1 = new Thread(threadEx2);
          thread1.start();
          Thread thread2 = new Thread(threadEx2);
          thread2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadEx2.getX());


    }

}
