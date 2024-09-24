package MultiThreadingQuestion;

public class ThreadPriorityExample {
    public static void main(String[] args) {

        SharedResource resource = new SharedResource(3);
        System.out.println("Main thread started");
        Thread th1=new Thread(()->{
            System.out.println("Thread calling produce method");
            try {
                resource.produce();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        th1.start();

        try{
            System.out.println("Main Thread is waiting for thread to finish now");
            th1.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Main thread is finishing its work");
    }
}
