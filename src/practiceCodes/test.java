package practiceCodes;

public class test {
	
	public static void main(String args[])
	{
		fun(5);
	}
	
//	static void fun(int n) {
//		if(n == 0 ) {
//			return;
//		}
//	System.out.println(n);
//	fun(n-1);
//	}

	
//	static void fun(int n)
//	{
//		if(n > 5) {
//			return;
//		}
//		System.out.println(n);
//		fun(n+1);
//	}
	static void fun(int n)
	{
		if(n ==0 ) {
			return;
		}
		System.out.println(n);
		
		fun(n-1);
		
		System.out.println(n);
	}
	
}
