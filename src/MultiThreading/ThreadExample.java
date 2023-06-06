package MultiThreading;

public class ThreadExample extends Thread{
    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample();
        thread1.start();
    }


    public void run() {
        System.out.println("MyThread Running");
        System.out.println("MyThread Finished");
    }
}
