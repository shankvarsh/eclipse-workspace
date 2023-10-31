package assignment45;

public class Q43 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new DisplayMessage("Good Morning", 1000));
        Thread thread2 = new Thread(new DisplayMessage("Hello", 2000));
        Thread thread3 = new Thread(new DisplayMessage("Welcome", 3000));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class DisplayMessage implements Runnable {
    private String message;
    private int interval;

    public DisplayMessage(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

