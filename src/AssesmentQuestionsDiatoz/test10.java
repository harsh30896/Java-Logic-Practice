package AssesmentQuestionsDiatoz;

public class test10 {
        static{
            System.out.println(1);
        }
    {
        System.out.println(2);
    }
    static{
        System.out.println(3);
    }
    {
        System.out.println(4);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i){
            test10 t = new test10();
            t.message();
        }

    }
    public static void message(){
        System.out.println("Hello World");
    }

}
