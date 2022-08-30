package OvO.Thread.Example;

public class MainForImpl {
    public static void main(String[] args) {
        System.out.println("Started Main____________");
        Runnable runnable = ()-> {

                System.out.println("started thread "+ Thread.currentThread().getName());
                int count = 0;

                while (!Thread.currentThread().isInterrupted()){
                    System.out.println(Thread.currentThread().getName() + " count i = " + count++);
                    if (count==10){
                        Thread.currentThread().interrupt();
                    }
                }
            System.out.println("finished thread "+ Thread.currentThread().getName());
        };
        Thread thread = new Thread(runnable, "My Runnable Thread");
        thread.start();
        System.out.println("Finished Main___________");
    }
}
