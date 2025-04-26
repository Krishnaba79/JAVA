import java.util.LinkedList;

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);
        
        // Create a producer thread
        Thread producerThread = new Thread(new Producer(buffer));
        
        // Create a consumer thread
        Thread consumerThread = new Thread(new Consumer(buffer));
        
        // Start the producer and consumer threads
        producerThread.start();
        consumerThread.start();
    }
}

class Buffer {
    private LinkedList<Integer> queue;
    private int capacity;
    
    public Buffer(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<>();
    }
    
    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (queue.size() == capacity) {
                wait();
            }
            
            queue.add(item);
            System.out.println("Produced: " + item);
            
            notify();
        }
    }
    
    public int consume() throws InterruptedException {
        synchronized (this) {
            while (queue.size() == 0) {
                wait();
            }
            
            int item = queue.removeFirst();
            System.out.println("Consumed: " + item);
            
            notify();
            
            return item;
        }
    }
}

class Producer implements Runnable {
    private Buffer buffer;
    
    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.produce(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;
    
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.consume();
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}