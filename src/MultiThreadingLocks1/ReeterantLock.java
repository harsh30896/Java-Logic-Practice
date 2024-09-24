package MultiThreadingLocks1;

import MultiThreadingQuestion.SharedResource;

public class ReeterantLock {
    public static void main(String[] args) {
       SharedResources resources=
               new SharedResources();
       Thread t1=new Thread(()->{
           resources.produce();
       });

       Thread th2 =new Thread(()->{
           resources.produce();
       });
       t1.start();
       th2.start();
    }
}
