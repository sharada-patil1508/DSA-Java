package Stack;
import java.util.*;
public class Pranthesis {
	public static boolean fun(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		for(char ch:s.toCharArray())
		{
			if(ch=='('||ch=='{'||ch=='[')
			{
				stack.push(ch);
			}else 
			if(ch==')')
			{
				if(stack.isEmpty()||stack.pop()!='(')
				{
					return false;
				}
			}else
			if(ch=='}')
			{
				if(stack.isEmpty()||stack.pop()!='{')
				{
					return false;
				}
			}
			else
				if(ch==']')
				{
					if(stack.isEmpty()||stack.pop()!='[')
					{
						return false;
					}
				}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		String s="{()}";
		boolean ans=fun(s);
		System.out.println(ans);
	}

}
