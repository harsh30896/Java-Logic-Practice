package MultiThreading;


public class ThreadExample_3 {

    public static void main(String[] args) {
        Runnable runnable =() ->{
           // System.out.println("Lambda Running");
           // System.out.println("Lambda finished");
        String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" running");
        };
        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();
    }

}
