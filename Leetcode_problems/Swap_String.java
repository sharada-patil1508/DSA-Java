package Leetcode_problems;
import java.util.*;
public class Swap_String {
	
	
	static Stack<Character> st=new Stack<>();
	
	public static void push(String s1)
	{
		
		
		for(int i=0;i<s1.length();i++)
		{
			char a=s1.charAt(i);
			st.push(a);
			
		}
		
		
	}
	
	public  static void display()
	{
		for(int i=0;i<st.size();i++)
		{
			System.out.println();
		}
	}
	
	
	/*public static boolean fun(String s1,String s2)
	{
		
		if(s1==null||s2==null&&s1.length()==s2.length())
		{
			return false;
		}
		
		
		
	}*/

	public static void main(String[] args) {
	
		String s1="bank";
		String s2="bank";
		
		push(s1);
		display();
		
		//boolean ans=fun(s1,s2);
		//System.out.println(ans);
	}

}
