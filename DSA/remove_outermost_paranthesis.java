package DSA;
import java.util.*;
public class remove_outermost_paranthesis {
	public static String fun(String str) {

	Stack<Character> stack1 = new Stack<Character>();
	StringBuilder result = new StringBuilder();
	
	// Iterate over the characters in the input string
	for (char ch : str.toCharArray()) {
		if (ch == '(') {
			if (!stack1.isEmpty()) {
				result.append(ch); // Append '(' if it's not the outermost
			}
			stack1.push(ch); // Push '(' onto the stack
		} else if (ch == ')') {
			stack1.pop(); // Pop the corresponding '(' from the stack
			if (!stack1.isEmpty()) {
				result.append(ch); // Append ')' if it's not the outermost
			}
		}
	}
	
	return result.toString();
}

public static void main(String[] args) {
	String name = "(()())(())"; // Example input
	System.out.println(fun(name)); // Output: "()()"
}
}


