package streamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysSortingTech
{
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        // Sort the array in descending order
        Arrays.sort(arr, Collections.reverseOrder());
       /// System.out.println(Arrays.toString(arr));


        ArrayList<Integer> arrayList =  new ArrayList<>(Arrays.asList(2,1,6,5,3,4));
        arrayList.stream().sorted((a,b)->b-a).forEach(System.out::println);

    }
}
