package MultiThreading;

public class ConsumeTask implements Runnable{

    SharedResources sharedResources;

    ConsumeTask(SharedResources sharedResources){
        this.sharedResources = sharedResources;
    }

    @Override
    public void run() {
        System.out.println("Consumer Thread: "
                +Thread.currentThread().getName());
        sharedResources.consumeItem();
    }
}
