package StringPractice;

public class StringTest {
    public static void main(String []args)
    {
        StringBuilder stbu=new StringBuilder();
        //Initial object size
        System.out.println(stbu.capacity());
        String str="Scaler";
        System.out.println(str);
        String str1 = new String("InterviewBit");
        System.out.println(str1);
        str1 += " Articles";         //string update
        String str2 = "InterviewBit Articles";
        if(str1 == "InterviewBit"){
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
        System.out.println(str1);
    }
}
