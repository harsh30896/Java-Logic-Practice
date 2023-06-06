package AssesmentQuestionsDiatoz;

public class test7 {

    public static int n = 10;

    static{
        n++;
    }

    {
        ++n;
    }
    {
        --n;
    }
    {
     ++n;
    }
    public test7(){
        --n;
    }

    public static void main(String[] args) {
        test7 test =  new test7();


        System.out.println(n);
    }

}
