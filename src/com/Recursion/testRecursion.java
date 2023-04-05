package com.Recursion;

public class testRecursion {

    public static void main(String[] args) {

        int num = 5;
        int result = func(num);
        System.out.println(result);

    }

    static int func(int n)
    {
       if(n <= 1)
       {
           return 1;
       }
        return func(n-1)+func(n-1);
    }
}
