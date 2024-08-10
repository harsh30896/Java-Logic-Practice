package MultiThreading;

public class ProduceTask implements Runnable{

    SharedResources sharedResources;

    ProduceTask(SharedResources resources){
        this.sharedResources = resources;
    }

    @Override
    public void run() {
        System.out.println("Producer thread: "
                +Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        sharedResources.addItem();
    }
}
