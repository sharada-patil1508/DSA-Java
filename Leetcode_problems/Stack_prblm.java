package Leetcode_problems;
import java.util.*;
public class Stack_prblm {
	public static int minAddToMakeValid(String s) {
		char[] arr=s.toCharArray();
		Stack<Character> stack=new Stack<Character>();
		int count = 0;
	
		for(int i=0;i<arr.length;i++)
		{
			char ch=s.charAt(i);
			if(ch=='(')
			{
				stack.push(ch);
			}
			if(ch==')')
			{
				if(stack.isEmpty()) {
					stack.push(ch);
				}
				else
				{
					stack.pop();
						
				}
			}
			count=stack.size();
		}
		
		return count;     
	 }

	public static void main(String[] args) {
		String str="())";
		int ans=minAddToMakeValid(str) ;
		 System.out.println((ans)); 
		

	}

}
