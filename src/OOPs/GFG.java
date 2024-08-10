package OOPs;

// Java program to Illustrate Creation of Object
// Using clone() method

// Main class
// Implementing Cloneable interface
class GFG implements Cloneable {

    // Method 1
    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        // Super() keyword refers to parent class
        return super.clone();
    }

    // Declaring and initializing string
    String name = "GeeksForGeeks";

    // Method 2
    // main driver method
    public static void main(String[] args)
    {
        GFG obj1 = new GFG();

        // Try block to check for exceptions
        try {

            // Using the clone() method
            GFG obj2 = (GFG)obj1.clone();

            // Print and display the main class object
            // as created above
            System.out.println(obj2.name);
        }

        // Catch block to handle the exceptions
        catch (CloneNotSupportedException e) {

            // Display the exception
            // using printStackTrace() method
            e.printStackTrace();
        }
    }
}
