package OOPs;

// In this example "parameterized constructor" called from default constructor using this keyword

class Second{
    Second(){
        this(5);
        System.out.println("hello second");
    }
    Second(int r){
        System.out.println(r);
    }
}
public class ThisKeywordExample_4 {
    public static void main(String[] args) {
        Second sc = new Second();
    }
}
