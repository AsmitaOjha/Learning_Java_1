import java.util.logging.Logger;

class First implements Runnable {
    private static final Logger logger = Logger.getLogger(First.class.getName());

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello Dora");
            try {
                Thread.sleep(10); // Using 10 milliseconds directly as a long value
            } catch (InterruptedException e) {
                logger.severe("Thread was interrupted: " + e.getMessage());
            }
        }
    }
}

class Second implements Runnable {
    private static final Logger logger = Logger.getLogger(Second.class.getName());

    public void run() {

        for (int i = 0; i < 50; i++) {
            System.out.println("Hello Monkey");
            try {
                Thread.sleep(10); // Using 10 milliseconds directly as a long value
            } catch (InterruptedException e) {
                logger.severe("Thread was interrupted: " + e.getMessage());
            }
        }
    }
}

public class Runnable_Thread_Example {
    public static void main(String[] args) {
        First task1 = new First();
        Second task2 = new Second();

        // Wrapping the runnable objects inside thread objects
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Starting both threads
        t1.start();
        t2.start();
    }
}
