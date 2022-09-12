package OvO.Thread.SynchronizedCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

        Collection syncCollection = Collections.synchronizedCollection(new ArrayList<>());
        Runnable runnable = () ->{
            syncCollection.addAll(Arrays.asList(1,2,3,4,5,6));

        };

        Thread thread1 = new Thread(runnable);

        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(syncCollection);

        ArrayList <Integer> intArray = new ArrayList<>();
        Runnable runnable2 = () ->{
            intArray.addAll(Arrays.asList(1,2,3,4,5,6));

        };

        Thread thread3 = new Thread(runnable2);

        Thread thread4 = new Thread(runnable2);

        thread3.start();
        thread4.start();
        thread3.join();
        thread4.join();

        System.out.println(intArray);
    }
}
