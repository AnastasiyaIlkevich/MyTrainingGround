package OvO.Thread.Example;

import java.util.Random;

public class ThreadExtendsThread extends Thread{

    public ThreadExtendsThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        Random random = new Random();
        int number = random.nextInt(1000-1)+1;
        System.out.println("started thread "+ Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            number = number/2;
            System.out.println(Thread.currentThread().getName() + " result = " + number);
        }
        System.out.println("finished thread "+ Thread.currentThread().getName());
    }
}
