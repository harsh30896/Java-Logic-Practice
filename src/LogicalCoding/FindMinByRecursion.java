package LogicalCoding;

public class FindMinByRecursion {
    public static int findMinRec(int A[], int n)
    {
        if (n == 1)
            return A[0];

        int valueOfA = A[n-1];

        int result = findMinRec(A,n-1);
        int value = Math.min(valueOfA,result);

        return value;
    }
    public static void main(String[] args) {
        int A[] = {1,8,0};
        int n = A.length;

        System.out.println(findMinRec(A,n));
    }
}
