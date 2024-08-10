package DesignPattern;

public class SingletonCloneClass implements Cloneable {
    private static volatile SingletonCloneClass instance;

    private SingletonCloneClass() {
        // Prevent instantiation
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static SingletonCloneClass getInstance() {
        if (instance == null) {
            synchronized (SingletonCloneClass.class) {
                if (instance == null) {
                    instance = new SingletonCloneClass();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        try {
            SingletonCloneClass instance1 = SingletonCloneClass.getInstance();
            System.out.println("Instance 1 hash: " + instance1.hashCode());

            // Attempt to clone the instance
            SingletonCloneClass instance2 = (SingletonCloneClass) instance1.clone();

            System.out.println("Instance 2 hash: " + instance2.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported for singleton objects.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
