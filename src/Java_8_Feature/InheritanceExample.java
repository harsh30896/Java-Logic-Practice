package Java_8_Feature;

class A{
    int a,b;
    public void add(int x, int y){
        a = x;
        b = y;
        System.out.println("Addition of a + b is : "+(a+b));
    }
}
public class InheritanceExample extends A{

    public void sum(int x, int y){
        add(x,y);
    }

    public static void main(String[] args) {
        InheritanceExample i1 = new InheritanceExample();
        i1.sum(5,9);

    }



}
