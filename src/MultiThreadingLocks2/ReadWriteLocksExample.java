package MultiThreadingLocks2;


import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLocksExample {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        ReadWriteLock lock=new ReentrantReadWriteLock();

        Thread th1 = new Thread(()->{
            resource.producer(lock);
        });

        Thread th2 = new Thread(()->{
            resource.producer(lock);
        });

        SharedResource resource1=new SharedResource();
        Thread th3=new Thread(()->{
            resource1.consume(lock);
        });

        th1.start();
        th2.start();
        th3.start();
    }
}
