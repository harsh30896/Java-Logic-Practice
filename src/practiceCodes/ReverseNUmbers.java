package practiceCodes;

public class ReverseNUmbers {
	public static void main(String argss[])
	{
		fun(12345);
		System.out.println(sum);
	}

	static int sum = 0;
	static void fun(int n) {
		
		if(n == 0)
			return;
		
		int rem = n% 10;
		sum = sum*10+rem;
		fun(n/10);
	}
	
}
