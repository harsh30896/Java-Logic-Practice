package com.Recursion;

public class PairSumSequence {
    public static void main(String[] args) {
        int n = 5;
        int sum = pairSumSequence(n);
        System.out.println("Pair sum sequence for " + n + " is " + sum);
    }

    public static int pairSumSequence(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }

    public static int pairSum(int a, int b) {
        return a + b;
    }
}

