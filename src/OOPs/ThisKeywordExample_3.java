package OOPs;

// In this class "this" is used to invoke current class constructor

class First
{
    First(){
        System.out.println("hello first");
    }
    First(int x){
        this();
        System.out.println(x);
    }
}
public class ThisKeywordExample_3 {
    public static void main(String[] args) {
        First f1=  new First(10);

    }
}
