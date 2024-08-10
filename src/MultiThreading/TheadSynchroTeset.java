package MultiThreading;

public class TheadSynchroTeset extends Thread{

	 public synchronized void task1(){
	        try{
	            System.out.println(" Inside the task 1 ");
	            Thread.sleep(10000);
	           
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	    }
	    public void task2(){
	        System.out.println(" Before synchronized method called  ");
	        synchronized (this){
	            System.out.println(" Task 2, inside synchronized method");
	        }
	    }
	    public void task3(){
	        System.out.println("Task 3 method is started execution");
	    }

	    public static void main(String[] args){
	        TheadSynchroTeset th = new TheadSynchroTeset();
	        Thread t1 = new Thread(()->th.task1());
	        Thread t2 = new Thread(()->th.task2());
	        Thread t3 = new Thread(()->th.task3());
	        t1.start();
	        t2.start();
	        t3.start();
	    }
	
}
