package OOPs;

// In this program "this" method is use to invoke current class method

class A{
    void m(){
        System.out.println("hello m");
    }
    void n(){
        System.out.println("hello n");
        this.m();
    }

}

public class ThisKeywordExample_2 {
    public static void main(String[] args) {
        A a = new A();
        a.n();

    }
}
