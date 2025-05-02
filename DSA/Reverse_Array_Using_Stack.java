package DSA;
import java.util.*;
public class Reverse_Array_Using_Stack {
	
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();
        int[] arr = {1, 2, 3, 4};
        
        // Push elements of the array onto the stack
        for (int i : arr) {
            stack.push(i);
        }

        // Pop elements from the stack back into the array
        for (int i = 0; i < arr.length; i++) {  // Change 5 to arr.length
            arr[i] = stack.pop();
        }

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
      }
}
