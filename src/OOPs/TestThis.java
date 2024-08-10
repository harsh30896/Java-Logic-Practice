package OOPs;

public class TestThis {
    int a;
    int b;

    // Default constructor
    TestThis()
    {
        a = 10;
        b = 20;
    }

    // Method that returns current class instance
//    TestThis get() { return this; }

    // Displaying value of variables a and b
    void display()
    {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args)
    {
        TestThis object = new TestThis();
        object.display();
    }
}
