package Strings;
import java.util.*;
public class Valid_paranthesis {
	
	public static String fun(String s)
	{
		Stack<Integer> stack=new Stack<>();
		Stack<Integer> invalid=new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='(')
			{
				stack.push(i);
			}
			else if(ch==')')
			{
				if(!stack.isEmpty())
				{
					stack.pop();
				}else
				{
					invalid.add(i);
				}
			}
			
			
		}
		
		while(!stack.isEmpty())
		{
			invalid.add(stack.pop());
		}
		
		StringBuilder res=new StringBuilder();
		
		for(int i=0;i<s.length();i++)
		{
			if(!invalid.contains(i))
			{
				res.append(s.charAt(i));
			}
		}
		
		return res.toString();
	}

	public static void main(String[] args) {
		String s="lee(t(c)o)de)";
		String ans=fun(s);
		System.out.println(ans);

	}

}
