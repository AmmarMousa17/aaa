import java.util.concurrent.*;
import java.util.function.Consumer;

public class Controller {

    private static BlockingQueue<Character> in = new ArrayBlockingQueue<>(26);
    static {
        try {
            Supplier.setIn(in);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




    static void applyTask(Consumer<BlockingQueue<Character>> c )  {

        BlockingQueue<Character> aa = Supplier.getIn();


        c.accept(aa);


    }


    }

