package DSA;
//https://leetcode.com/problems/reverse-prefix-of-word/description/
import java.util.*;
public class Stack_revrse {
	
	public static  String fun(String str,char ch)
	{
		Stack<Character> stack=new Stack<Character>();
		
		for(char c:str.toCharArray())
		{
			stack.push(c);
			if(c==ch)
			{
				break;
			}
		}
		
		StringBuilder rev=new StringBuilder();
		
		if(stack.isEmpty()||(stack.peek()!=ch&&stack.indexOf(ch)==-1))
		{
			return str;
			
			/*This checks if ch is present in word.
			If indexOf(ch) returns -1, it means that ch is not found in word at all.*/
		}
		
		while(!stack.isEmpty())
		{
			rev.append(stack.pop());
		}
			
		int index=rev.length();
		if(index<str.length()) {
			rev.append(str.substring(index));
		}
		return rev.toString();
		
		
	}

	public static void main(String[] args) {
		String name="sharada";
		char ch='r';
		
		
	System.out.println(	fun(name,ch));
		

	}

}
