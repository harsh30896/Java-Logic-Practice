package Recursion.ArrayConcept;

public class LinearSearchArray {

	public static void main(String args[]) {
	int[] arr = {1,2,4,71,92};

	System.out.println(fun(arr,0,71));
	
}

static boolean fun(int[] arr, int index, int num)
{
	if(index >= arr.length-1) {
		return false;
	}
	
	if (arr[index] == num) {
        return true;
    }

    return fun(arr, index + 1, num);
}
	
}