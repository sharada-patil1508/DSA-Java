package Leetcode_problems;
//https://leetcode.com/problems/distribute-candies/description/
import java.util.*;
public class CondyType {
	
	 public static  void distributeCandies(int[] arr) {
		 int count = 0;
		    boolean isDifferent = true; // Flag to check if all elements are equal

		    // Ensure the loop has a termination condition
		    while (isDifferent && arr.length > 0) {
		        count = 1; // Reset count for each iteration
		        isDifferent = false; // Assume all elements are equal initially

		        for (int i = 0; i < arr.length - 1; i++) {
		            if (arr[i] != arr[i + 1]) {
		                count++; // Increment count for unique candies
		                isDifferent = true; // Indicate that not all elements are equal
		            }
		        }

		        // Exit condition: If all elements are equal, break the loop
		        if (!isDifferent) {
		            break;
		        }
		    }
		    System.out.println(count);
	        
	    }

	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3};
		distributeCandies(arr);
		
		
		

	}

}
