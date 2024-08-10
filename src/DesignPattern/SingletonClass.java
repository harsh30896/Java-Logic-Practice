package DesignPattern;
// using serializable context

import java.io.*;

public class SingletonClass implements Serializable {
    private static volatile SingletonClass instance;

    private SingletonClass() {
        // Prevent reflection from creating another instance
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    // readResolve Method is overriden over here
    protected Object readResolve() {
        return getInstance();
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        try {
            SingletonClass instance1 = SingletonClass.getInstance();
            System.out.println("Instance 1 hash: " + instance1.hashCode());

            // Serialize the instance
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            out.writeObject(instance1);
            out.close();

            // Deserialize the instance
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
            SingletonClass instance2 = (SingletonClass) in.readObject();
            in.close();

            System.out.println("Instance 2 hash: " + instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
