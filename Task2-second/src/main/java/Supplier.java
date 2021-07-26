import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Supplier {

    public static void setIn(BlockingQueue<Integer> in,ExecutorService executor) throws InterruptedException {


        Runnable producerTask = () -> {
        try {
            int value = 0;
            while (true) {
                in.put(value);

                System.out.println("Produced " + value  );

                value++;

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };
        executor.submit(producerTask);
}}
