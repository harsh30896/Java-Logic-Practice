package ThreadingExample;
class MyClassThreadTest implements  Runnable{
    @Override
    public void run() {
        System.out.println("Getting the name of the thread that is currently under execution "+Thread.currentThread().getName());
    }
}
public class MultiThreadingLearning {
    public static void main(String[] args) {
        MyClassThreadTest myTT = new MyClassThreadTest();
        Thread thread = new Thread(myTT);
        thread.start();
        System.out.println("My Current Thread is =  "+Thread.currentThread().getName());
    }
}
