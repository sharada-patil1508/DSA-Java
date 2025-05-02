package Javaclass;

public class Palindrome {
	static boolean palindrome(int n)
	{
		int rev=0;
		int org=n;
		while(n!=0)
		{
			int rem=n%10;
			rev=rem+(rev*10);
			n=n/10;
			
		}
	return rev==org;
	}

	public static void main(String[] args) {
		int n=121;
		System.out.println(palindrome(n));
		
	

	}

}
