package DesignPattern;

import MultiThreading.Thread2;

import java.lang.reflect.Constructor;

class SingleRunner {
    private static SingleRunner instance;

    private SingleRunner() {
        if (instance != null) {
            throw new RuntimeException("Instance already exists. Use getInstance() method to get the single instance of this class.");
        }
    }


    public static DesignPattern.SingleRunner getInstance() {
        if (instance == null) {
            synchronized (SingleRunner.class) {
                if (instance == null) {
                    instance = new SingleRunner();
                }
            }
        }
        return instance;
    }
}



    public class SingletonRunner{
        public static void main(String[] args) throws Exception {
            SingleRunner instance1 = SingleRunner.getInstance();
            System.out.println("Instance 1 hash: " + instance1.hashCode());

//            SingleRunner obj = new SingleRunner();
//            System.out.println(obj.hashCode());

            // Attempt to create a second instance using reflection
            // this particular part and how this constructor works
            Constructor<SingleRunner> constructor = SingleRunner.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            SingleRunner instance2 = constructor.newInstance();
            System.out.println("Instance 2 hash: " + instance2.hashCode());




        }

}

