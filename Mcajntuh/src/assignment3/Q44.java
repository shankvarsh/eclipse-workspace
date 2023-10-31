package assignment3;
//actually this is assignment 4 from chatgpt
import java.util.LinkedList;

public class Q44 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5); // Buffer size is 5

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}

class Buffer {
    private LinkedList<Integer> data;
    private int maxSize;

    public Buffer(int maxSize) {
        this.data = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (data.size() == maxSize) {
            wait();
        }
        data.add(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (data.isEmpty()) {
            wait();
        }
        int value = data.remove();
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.consume();
                Thread.sleep(1500); // Sleep for 1.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
