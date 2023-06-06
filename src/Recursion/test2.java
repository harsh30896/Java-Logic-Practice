package Recursion;

public class test2 {
	
	public static void main(String argss[])
	{
		fun(5);
	}

	static void fun(int n)
	{
		if(n==0) {
			return;
		}
		System.out.println(n);
		fun(--n);
	}
}
