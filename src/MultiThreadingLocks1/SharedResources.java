package MultiThreadingLocks1;

import java.util.concurrent.locks.ReentrantLock;


// Reetrant Lock:
public class SharedResources {
    boolean isAvailable=false;
    ReentrantLock lock=new ReentrantLock();
    public void produce() {
        try {
            lock.lock();
            System.out.println("Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e){
        }
        finally {
            lock.unlock();
            System.out.println("Lock release by: "+Thread.currentThread().getName());
        }
    }
}
