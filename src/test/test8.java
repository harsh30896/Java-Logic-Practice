package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test8 {
    public static void main(String[] args) {
        List<String>arr = new ArrayList<>();
        // 1,3,7,2,10
        arr.add("1");
        arr.add("3");
        arr.add("7");
        arr.add("2");
        arr.add("20");
        // implementing selection sort for the sorting purpose
//        for(Integer i = 0; i < arr.size(); i++){
//             Integer index = i;
//            for(Integer j = i+1;j < arr.size(); j++){
//                if(arr[j] < arr[index]){
//                    index = j;
//                }
//            }
//            int smallNum = arr[index];
//            arr[index] = arr[i];
//            arr[smallNum] = arr[i];
//        }
//
//
//        for(int i: arr){
//            System.out.println(i);
//        }
        //Collections.sort(arr);
//        List<Integer> arr2 = new ArrayList<>();
//        for(String i: arr){
//            Integer n = Integer.parseInt(i);
//            arr2.add(n);
//        }



        System.out.println(arr);
        // Arrays.sort(arr);
    }

}
