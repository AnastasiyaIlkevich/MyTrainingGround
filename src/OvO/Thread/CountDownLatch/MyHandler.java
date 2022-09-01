package OvO.Thread.CountDownLatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class MyHandler implements Runnable {

    private final CountDownLatch countDownLatch;

    Scanner scanner = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();

    public MyHandler(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Enter five numbers!");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
            countDownLatch.countDown();
        }
    }
}


