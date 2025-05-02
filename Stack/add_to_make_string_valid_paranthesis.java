package Stack;
import java.util.*;
public class add_to_make_string_valid_paranthesis {
	
	public static int fun(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		int count=0;
		for(char ch:s.toCharArray())
		{
			if(ch=='(')
			{
				stack.push(ch);
			}else
				if(ch==')')
				{
					if(stack.isEmpty())
					{
						count++;
					}else
					{
						stack.pop();
					}
						
				}
		}
		return count+stack.size();
		
		
	}

	public static void main(String[] args) {
		String s="((()";
		int ans=fun(s);
		System.out.println(ans);
		
	}

}
