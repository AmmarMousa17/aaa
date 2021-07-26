import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class Consumers {



    public static void runTasks(int n) throws InterruptedException {
        final ExecutorService executor = Executors.newFixedThreadPool(n);
        BlockingQueue<Character> bq= Supplier.getIn();
        Runnable task;
        Integer counter= 0;
        while (counter < 20 ) {
            task = () -> {
                try {
                    char s = bq.take();


                    System.out.println("Consume: "+ s +" "+ Thread.currentThread().getName());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            executor.execute(task);
            counter++;
        }
         executor.shutdown();


    }

    public static Consumer<BlockingQueue<Character>> consumeTasks(){
        return bqs -> {
            try {
                runTasks(6);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }

}


