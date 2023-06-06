package AssesmentQuestionsDiatoz;

public class test5 {

    public void doA(int k)throws Exception{
        for(int i = 0; i < 10; i++){
            if(i == k) throw new Exception("Index of k is "+i);
        }
    }
    public void doB(boolean f)  {
        if(f){
            try {
                doA(15);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else return;
    }

    public static void main(String[] args) {
        System.out.println("args length  = "+args.length);
        test5 t_5 = new test5();
        t_5.doB(args.length>5);
    }
}
