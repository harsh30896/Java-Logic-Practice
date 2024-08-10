package StringPracticeHowDoInJava;

public class StringJavaConceptOfTheDAyPrac {
    public static void main(String[] args) {
        char[] charArr = {'a','b','h','a','y','i','s','d','i','c','k'};
        String str =  "salesforce";
       //byte[] byteArr = str.getBytes();
        str = str.copyValueOf(charArr);
       String str3 = str.copyValueOf(charArr, 5, 3 );
        System.out.println(str3);
    }
}
