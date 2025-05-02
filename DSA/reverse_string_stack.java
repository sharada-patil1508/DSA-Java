package DSA;
import java.util.*;
public class reverse_string_stack {

	public static void main(String[] args) {
		Stack<Character> stack=new Stack<Character>();
		String s="sharada patil";
		
		for(char ch:s.toCharArray())
		{
			stack.push(ch);
		}
		
		StringBuilder rev=new StringBuilder();
		for(char ch:s.toCharArray())
		{
			rev.append(stack.pop());
		}
		
		System.out.println(rev.toString());
		
	
	}

}
