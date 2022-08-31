package OvO.Thread.Semaphore.Parking;

import java.util.concurrent.Semaphore;

public class Runner {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(4);

        for (int i = 0; i < 8; i++) {
            new Parking(semaphore, "Car number " + i).start();

        }
    }
}
