package LockFreeMechanismThread;


// Lock Free Machanism
// Atomic Integer

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {

    AtomicInteger counter = new AtomicInteger(0);
    public void increment(){
        counter.incrementAndGet();
    }
    public int getCounter(){
        return counter.get();
    }
}
