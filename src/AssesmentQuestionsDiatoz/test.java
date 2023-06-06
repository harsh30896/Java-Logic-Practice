package AssesmentQuestionsDiatoz;

class Parent{}
class Child extends Parent{}
public class test {
    public static void main(String args[]){
        Parent cobj = new Child();
        if(cobj instanceof Child){
            System.out.println("cobj is an instance of child");
        }
        else{
            System.out.println("cobj is NOT instance of child");
        }
    }
}
