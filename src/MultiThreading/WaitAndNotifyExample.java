package MultiThreading;

public class WaitAndNotifyExample {
    private static final Object lock = new Object();
    private static boolean taskComplete = false;

    public static void main(String[] args) {
        Thread waitingThread = new Thread(() -> {
            synchronized (lock) {
                while (!taskComplete) {
                    try {
                        lock.wait();  // Wait until the task is complete
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Task completed, resuming execution.");
            }
        });

        Thread notifyingThread = new Thread(() -> {
            synchronized (lock) {
                taskComplete = true;
                lock.notify();
                // Notify the waiting thread
                System.out.println("Task done. Notifying waiting thread.");
            }
        });


        waitingThread.start();
        notifyingThread.start();
    }
}
