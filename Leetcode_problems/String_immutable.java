package Leetcode_problems;

public class String_immutable {

	public static void main(String[] args) {	
		String str1="sharada";
		
		String str2=str1;
		str1=str1+"patil";
		if(str1==str2)
		{
			System.out.println("strings are not immutable");
		}else
		{
			System.out.println("Strings are immutable");
		}
	}

}
