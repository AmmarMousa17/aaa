import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BQueue {
    BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(100);


    public BlockingQueue<Integer> getBlockingQueue() {
        return blockingQueue;
    }
}
