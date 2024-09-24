package VolatileExampleTest;

public class SharedResource {
    int counter=0;
    public  void increment(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }
}
