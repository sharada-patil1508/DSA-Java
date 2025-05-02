package DSA;
import java.util.*;
public class ValidParanthesis2 {
	public static int count(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		
		
		for(char ch:s.toCharArray())
		{
			if(ch==')')
			{
				if(!stack.isEmpty()&&stack.peek()=='(')
				{
					stack.pop();
				}else {
					stack.push(ch);
				}
			}
			else {
				stack.push(ch);
				}
		}
		return stack.size();
	}

	public static void main(String[] args) {
		
		System.out.println(count("(()"));
		

	}

}
