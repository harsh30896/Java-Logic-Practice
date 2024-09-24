package MultiThreadingQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    boolean isAvailable=false;
    public synchronized void produce(){
        System.out.println("Lock acquired");
        isAvailable = true;
        try{
            Thread.sleep(8000);
        }catch (Exception e){

        }
        System.out.println("Lock Release"+Thread.currentThread().getName());
    }


//
//    public synchronized void produce(int item)throws Exception
//    {
//        System.out.println(sharedBuffer.size());
//        while(sharedBuffer.size() == bufferSize){
//            System.out.println("Buffer is full," +
//                    "Producer is waiting for consumer");
//            wait();
//        }
//        sharedBuffer.add(item);
//        System.out.println("Produced: "+item);
//        notify();
//    }
//

    public synchronized int consume()throws Exception{
        while (sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty," +
                    "Consumer is waiting for producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumed: "+item);
        notify();
        return item;

    }
}
