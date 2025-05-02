package DSA;

import java.util.Stack;

public class Validparenthisis {
	
	public static boolean isvalid(String s)
	{
		 Stack<Character> stack = new Stack<Character>();
	        
	        for (char ch : s.toCharArray()) {
	            if (ch == '(' || ch == '[' || ch == '{') {
	                stack.push(ch);
	            } else {
	                if (ch == ')') {
	                    if (stack.isEmpty() || stack.pop() != '(') {
	                        return false;
	                    }
	                } else if (ch == '}') {
	                    if (stack.isEmpty() || stack.pop() != '{') {
	                        return false;
	                    }
	                } else if (ch == ']') {
	                    if (stack.isEmpty() || stack.pop() != '[') { 
	                        return false;
	                    }
	                }
	            }
	        }
	        return stack.isEmpty();
	} 
	
	public static void main(String[] args)
	{
		System.out.println(isvalid("{}"));
		System.out.println(isvalid("{}]"));
	}

}
