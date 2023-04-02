package com.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static int[] twoSum(int[] nums, int target)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int compliment = target - nums[i];
            if(map.containsKey(compliment))
            {
                return new int[]{map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String args[])
    {
        int target = 9;
        int[] arr = new int[]{2, 7, 11, 15};
        int[] getArr = twoSum(arr,target);
      for(int i = 0; i< getArr.length;i++)
      {
          System.out.println(getArr[i]);
      }
    }
}
