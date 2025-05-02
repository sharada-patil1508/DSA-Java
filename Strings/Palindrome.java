package Strings;

public class Palindrome {
	
	

	public static boolean isPalindrome(String str,int left,int right)
	{
		if(left>=right)
		{
			return true;
		}
		
		if(str.charAt(left)!=str.charAt(right))
		{
			return false;
		}
		
		return isPalindrome(str,left+1,right-1);
	}

	public static void main(String[] args) {
	String str="abcbae";
	
	
	if(isPalindrome(str,0,str.length()-1))
	{
		System.out.println("the string is paindrome");
	}
	else
	{
		System.out.println("the string is not palindrome");
	}
	
	}

}
