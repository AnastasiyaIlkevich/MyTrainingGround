package OvO.Thread.Ship;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Available number of cores: " + Runtime.getRuntime().availableProcessors());

        Tunnel tunnel = new Tunnel();

        ShipGenerator shipGenerator = new ShipGenerator(tunnel, 10);

        ThreadPierLoader pierLoader1 = new ThreadPierLoader(tunnel, Type.FOOD);
        ThreadPierLoader pierLoader2 = new ThreadPierLoader(tunnel, Type.CLOTHES);
        ThreadPierLoader pierLoader3 = new ThreadPierLoader(tunnel, Type.TOYS);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(shipGenerator);
        service.execute(pierLoader1);
        service.execute(pierLoader2);
        service.execute(pierLoader3);

        service.shutdown();


    }
}


