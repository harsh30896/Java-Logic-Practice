package Recursion;

public class Factorial {

	public static void main(String args[])
	{
		int val  = fun(5);
		System.out.println(val);
	}
	public static int fun(int n)
	{
		if(n == 1) {
			return 1;
		}
		return n*fun(n-1);
	}
	
}
