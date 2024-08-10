package MultiThreading;

public class SharedResources {

    boolean itemAvailable = false;

    public synchronized void addItem(){
        itemAvailable = true;
        System.out.println("Item added by : "+
                Thread.currentThread().getName()
                +" and invoking all the thread which are waiting");
        notify();

    }
    public synchronized void consumeItem(){
        System.out.println("ConsumeItem method invoked by"
        + Thread.currentThread().getName());

        while(!itemAvailable){
            try {
                System.out.println("Thread"
                +Thread.currentThread().getName()
                +"is waiting");
                wait();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Items consumed by"
                +Thread.currentThread().getName());
        itemAvailable = false;
    }

}
