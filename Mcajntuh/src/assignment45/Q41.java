package assignment45;

public class Q41 {
    public static void main(String[] args) {
        Thread javaThread = new JavaThread();
        Thread programmingThread = new ProgrammingThread();

        javaThread.start();
        programmingThread.start();
    }
}

class JavaThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("JAVA");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ProgrammingThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("PROGRAMMING");
            try {
                Thread.sleep(300); // Sleep for 300 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

