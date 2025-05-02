package Stack;
import java.util.*;

public class Remove_paranthesis {
    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> invalid = new HashSet<>();

        // Step 1: Process the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i); // Track index of '('
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop(); // Match with an open parenthesis
                } else {
                    invalid.add(i); // Unmatched ')'
                }
            }
        }

        // Step 2: Add remaining unmatched '(' to the invalid set
        while (!stack.isEmpty()) {
            invalid.add(stack.pop());
        }

        // Step 3: Build the result string
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!invalid.contains(i)) {
                res.append(s.charAt(i)); // Append only valid characters
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "lee(t(c)o)de))";
        String ans = minRemoveToMakeValid(s);
        System.out.println(ans); // Output: "lee(t(c)o)de"
    }
}
