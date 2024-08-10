package InterfaceExample;

interface MyInterface{
    default void defaultMethod(){
        System.out.println("This is inside default method interface");
    }

    static void staticMethod(){
        System.out.println("This is inside static method interface");
    }

    public void abstractMethod();

    String toString();
}

class InterfaceExample implements MyInterface{


    @Override
    public void abstractMethod() {
    }

}

public class Functional_Interface_Example {
    public static void main(String[] args) {
        InterfaceExample interfaceExample  = new InterfaceExample();
        interfaceExample.abstractMethod();
        interfaceExample.defaultMethod();
        MyInterface.staticMethod();
    }
}
