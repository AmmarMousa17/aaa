import java.util.concurrent.*;

public class Supplier {

     private static BlockingQueue<Character> in = new ArrayBlockingQueue<>(26);

    public static void setIn(BlockingQueue<Character> in) throws InterruptedException {
        Supplier.in = in;
        for (char ch = 'A'; ch <= 'Y'; ch++) {
            in.put(ch);
            System.out.println("Produce : "+ ch +" "+ Thread.currentThread().getName());
        }
    }

    public static BlockingQueue<Character> getIn() {
        return in;
    }
}


















