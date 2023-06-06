package test;

public class test7 implements Runnable {
    public static void main(String[] args) {
        // two thread
        // 1 thread welcome harsh
        // 2 thread welcom shubham
        test7 t_7 = new test7();
        Thread thread = new Thread(t_7);
        thread.start();

    }
    public void run(){
        System.out.println("Hello Shubham");
    }
}
