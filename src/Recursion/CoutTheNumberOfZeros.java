package Recursion;

public class CoutTheNumberOfZeros {

	public static void main(String args[]) {

		CountZero(302040);
		System.out.println(count);
		
	}
	
	static int sum =0;
	static int count=0;
	
	static void CountZero(int n) {
		
		if(n == 0) {
			return;
		}
		sum = n%10;
		if(sum == 0) {
			++count;
		}
		CountZero(n/10);
		
	}
	

}
