package Baisc_prgms;

public class Palindrome {

	public static void main(String[] args) {
		String str1="aabaa";
		String str2="";
		boolean falge=false;
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2+=str1.charAt(i);
		}
		if(str1.equals(str2))
		{
			System.out.println("palindrome");
			falge=true;
		}
		if(!falge)
		{
			System.out.println("not");
		}
		
		
	}

}
