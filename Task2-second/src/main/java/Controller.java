import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;

import static java.lang.Thread.sleep;

public class Controller {

 static MyExecutor executor =new MyExecutor();
 static BQueue queue=new BQueue();

  private static ExecutorService myexecutor = executor.getExecutor();
  private static BlockingQueue<Integer> myqueue =queue.getBlockingQueue();


    public static  void applyTasks(Consumer<Integer> s) {


        Runnable consumerTask = () -> {
            try {
                while (true) {
                    s.accept(myqueue.take());


                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
         executor.getExecutor().execute(consumerTask);


    }

    public static void getTasks() throws InterruptedException {

        Supplier.setIn(myqueue,myexecutor);
        Consumer<Integer> as =(ss)->{
            System.out.println("Consume : "+ ss);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Controller.applyTasks(as);

    }

    /*
    public  static void getIn(BlockingQueue<Integer> in,ExecutorService executor) {


        Runnable consumerTask = () -> {

            try {
                while (true) {
                    int value = in.take();

                    System.out.println("Main " + value);

                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        executor.submit(consumerTask);


    }
    public  static void getTask2(Consumer<Integer> s,BlockingQueue<Integer> a,ExecutorService executor) {

        Runnable task;

     while (!a.isEmpty()) {
         try {
             Thread.sleep(100000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
          task = () -> {

             try {
                 s.accept(a.take());


             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         };
         executor.execute(task);

     }
    }*/

}



