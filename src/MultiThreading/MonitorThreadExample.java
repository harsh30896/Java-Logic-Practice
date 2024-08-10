package MultiThreading;

public class MonitorThreadExample {

    public static void main(String[] args) {
        System.out.println("Main method start");
        SharedResources sharedResources = new SharedResources();

        Thread produceThread = new Thread(new ProduceTask(sharedResources));
        Thread consumeThread = new Thread(new ConsumeTask(sharedResources));

        produceThread.start();

        consumeThread.start();

        System.out.println("Main method end");
    }
}
