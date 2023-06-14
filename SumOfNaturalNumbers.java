package Recursion;

public class SumOfNaturalNumbers {
	
	public static void main(String args[])
	{
		int val = fun(4);
		System.out.println(val);
	}
	
	public static int fun(int num)
	{
		if(num <= 1)
		{
			return 1;
		}
		
		return num+fun(num-1);
	}

}
