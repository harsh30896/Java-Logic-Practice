package test;

import jdk.dynalink.beans.StaticClass;

class PrivateExample{
    private int roll;
    private String name;

    static void printHello(){
        System.out.println("Intialized by static method");
    }
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
public class UserTest {
    public static void main(String[] args) {
        PrivateExample.printHello();
        // PrivateExample.name of static class test = new Pr

    }
}

// cloneable // serializable
// Singleton Design Pattern
// clone()

//static class
//static method
//static variables
