package OvO.Thread.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Runner {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        MyHandler myHandler = new MyHandler(countDownLatch);

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            System.err.println("InterruptedException");
        }

        myHandler.numbers.stream()
                .mapToInt(Integer::valueOf)
                .map(x -> x * 2)
                .forEach(System.out::println);

    }
}
