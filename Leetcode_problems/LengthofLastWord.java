package Leetcode_problems;
//https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&envId=top-interview-150
import java.util.*;
public class LengthofLastWord {

	public static void main(String[] args) {
		String str="hello world";
		int ans=fun(str);
		System.out.println(ans);

	}
	static int fun(String s)
	{
		int n=s.length();
		int count=0;
		int i=n-1;
		 // Skip any trailing spaces at the end of the string
		/*This loop skips any trailing spaces at the end of the string by decrementing i until 
		 * a non-space character is found or the start of the string is reached.*/
		 
		while(i>=0&&s.charAt(i)==' ')
		{
		
			i--;
		}
		while(i>=0&&s.charAt(i)!=' ')
		{
			count++;
			i--;
		}
		return count;
	}

}
