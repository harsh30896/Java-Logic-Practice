package test;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,5,6,6};

        for(Integer x: findDuplicates(arr)){
            System.out.println(x);
        }
    }
    static List<Integer> findDuplicates(int[] arr){
        List<Integer> res = new ArrayList<>();
        for(int i =0; i < arr.length-1; i++){
            for(int j= i+1; j <arr.length; j++){
                if(arr[i]== arr[j]){
                    if (!res.contains(arr[i])) {
                        res.add(arr[i]);
                    }
                    break;
                }
            }
        }
        return res;
    }

}
