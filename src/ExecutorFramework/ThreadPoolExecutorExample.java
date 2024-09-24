package ExecutorFramework;

import java.util.concurrent.*;

public class ThreadPoolExecutorExample
{
    public static void main(String[] args) {

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 5, 1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10), new CustomThreadFactor(),
                new CustomRejectHandler());

        poolExecutor.allowCoreThreadTimeOut(true);
        for (int i = 0; i < 25; i++) {
            poolExecutor.submit(() -> {
                try {
                    Thread.sleep(5000);
                    System.out.println("Thread name " + Thread.currentThread().getName());
                } catch (Exception e) {
                }
            });
        }
        poolExecutor.shutdown();
    }
}
class CustomRejectHandler implements RejectedExecutionHandler{


    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task Denied: "+ r.toString());
    }
}
class CustomThreadFactor implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread th=new Thread();
        return th;
    }
}