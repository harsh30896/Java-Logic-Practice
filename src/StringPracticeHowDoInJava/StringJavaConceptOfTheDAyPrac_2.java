package StringPracticeHowDoInJava;

import java.util.ArrayList;
import java.util.List;

public class StringJavaConceptOfTheDAyPrac_2 {

    public static void main(String[] args) {
           String str = new String("hello world this is java");
        char[] dest = new char[40];
           try {
               str.getChars(3, 14, dest, 2);
           }
           catch (Exception e){
               e.printStackTrace();
           }

//            for(int i= 0;i<15;i++){
//                System.out.print(dest[i]);
//            }

        int  i = 100;
       // System.out.println(String.valueOf(i));
        char[] chars = {'a','b','h','a','y','i','s','d','i','c','k'};
        List<Integer> nLIst = new ArrayList<>();
        nLIst.add(10);
        nLIst.add(2);
        nLIst.add(3);
        nLIst.add(40);
        nLIst.add(5);
        nLIst.stream().
                filter(n->n%5==0).forEach(System.out::println);
    }
}
