import java.util.Random;

public class MultiThreadCube {
    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        NumberProcessor processor = new NumberProcessor();
        
        Thread t1 = new Thread(generator);
        Thread t2 = new Thread(processor);
        Thread t3 = new Thread(processor);
        
        t1.start();
        t2.start();
        t3.start();
    }
}

class RandomNumberGenerator implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        
        while (true) {
            int number = random.nextInt(100);  // Generate random number between 0 and 99
            System.out.println("Generated number: " + number);
            
            if (number % 2 == 0) {
                NumberProcessor.processSquare(number);
            } else {
                NumberProcessor.processCube(number);
            }
            
            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class NumberProcessor implements Runnable {
    private static final Object lock = new Object();
    
    public static void processSquare(int number) {
        synchronized (lock) {
            System.out.println("Square: " + number * number);
        }
    }
    
    public static void processCube(int number) {
        synchronized (lock) {
            System.out.println("Cube: " + number * number * number);
        }
    }
    
    @Override
    public void run() {
        // This thread doesn't perform any operations
    }
}