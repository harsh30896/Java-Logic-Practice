package AssesmentQuestionsDiatoz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// class cast Exception
public class test8 {
    public static void main(String[] args) {
        String[] names = new String[]{"name1","name2","name3","name4"};
     //   List<String> nameList = (ArrayList<String>) Arrays.asList(names);
        List<String> nameList =  Arrays.asList(names);
        System.out.println("Names -> \n"+nameList);
    }
}
