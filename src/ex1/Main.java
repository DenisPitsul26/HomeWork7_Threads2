package ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Thread shipThreadOne = new Thread(new ShipThread("shipOne", 10));
        Thread shipThreadTwo = new Thread(new ShipThread("shipTwo", 10));
        Thread shipThreadThree = new Thread(new ShipThread("shipThree", 10));

        service.execute(shipThreadOne);
        service.execute(shipThreadTwo);
        service.execute(shipThreadThree);
        service.shutdown();
    }
}
