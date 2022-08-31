package OvO.Thread.Semaphore.Parking;

import java.util.concurrent.Semaphore;

public class Parking extends Thread{

    private Semaphore semaphore;
    private String name;

    public Parking(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    public void run() {
        System.out.println(this.name + " Start Thread");
        System.out.println(this.name + " waiting for a free parking space");
        try {
            this.semaphore.acquire();
        } catch (InterruptedException e) {
            System.err.println("InterruptedException");
        }
        System.out.println(this.name + " parks");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException");
        }
        System.out.println(this.name + " car leaves the parking lot");
        this.semaphore.release();

    }
}
