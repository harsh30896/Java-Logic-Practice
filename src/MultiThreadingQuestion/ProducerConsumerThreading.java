package MultiThreadingQuestion;

public class ProducerConsumerThreading {
    public static void main(String[] args) {
        SharedResource sharedBuffer =
                new SharedResource(4);
//
//        Thread produceThread = new Thread(()->{
//            try{
//                for(int i = 0; i<=6; i++){
//                    sharedBuffer.produce(i);
//                }
//            }
//            catch (Exception e)
//            {
//                e.printStackTrace();
//            }
//        });

        Thread consumerThread = new Thread(()->{
           try{
               for(int i = 0; i <= 6; i++){
                   sharedBuffer.consume();
               }
           }
           catch (Exception e){
               e.printStackTrace();
           }
        });

       // produceThread.start();
        consumerThread.start();

    }
}
