package practiceCodes;

import java.util.ArrayList;
import java.util.List;

public class SearchAndReturnIndex {

    public static void main(String args[]) {
        int[] arr = {1, 2, 4, 71, 92, 4};
        List<Integer> result = fun(arr, 0, 4);
        System.out.println(result);
    }

    static List<Integer> fun(int[] arr, int index, int num) {
        List<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == num) {
            list.add(index);
        }

        List<Integer> ar = fun(arr, index + 1, num);
        list.addAll(ar);

        return list;
    }

}
