package Recursion;

public class DigitSum {

	public static void main(String args[])
	{
		int val = digiSum(123);
		System.out.println(val);
	}
	
	public static int digiSum(int n) {
		
		if(n == 0) {
			return 0;
		}
		return (n%10)+digiSum(n/10);
	}
	
}
