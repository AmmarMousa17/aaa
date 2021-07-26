
import java.util.concurrent.BlockingQueue;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

               Consumer<BlockingQueue<Character>> d= Consumers.consumeTasks();
               Controller.applyTask(d);


}}