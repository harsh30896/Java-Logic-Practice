package Recursion;

public class StringPalindromeOrNot 
{
	public static boolean checkString(String str,int start,int end)
	{
		if(start >= end)
			return true;
		
		return(str.charAt(start) == str.charAt(end)) &&  checkString(str,start+1,end-1);
		
	}
	
	public static void main(String args[])
	{
	
		String str = "abbcbba";
		int start = 0; 
		int end = str.length()-1;
		boolean val = checkString(str,start,end);
		System.out.println(val);
	}

}
