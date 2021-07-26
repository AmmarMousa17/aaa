import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class MyExecutor {


    private ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(5);

    public ExecutorService getExecutor() {
        return executor;
    }

}
