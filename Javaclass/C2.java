package Javaclass;

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int minOperations(int[] nums) {
	        int n = nums.length;
	        int count = 0;

	        for (int i = 0; i <= n - 3; i++) {
	            if (nums[i] == 0) {
	                count++;
	                // Flip the next three elements
	                nums[i] = 1 - nums[i];
	                nums[i + 1] = 1 - nums[i + 1];
	                nums[i + 2] = 1 - nums[i + 2];
	            }
	        }

	        // Check if the array contains any 0s in the last two elements
	        if (nums[n - 2] == 0 || nums[n - 1] == 0) {
	            return -1;
	        }

	        return count;
	    }
	}

}
/*You are given a binary array nums.

You can do the following operation on the array any number of times (possibly zero):

Choose any 3 consecutive elements from the array and flip all of them.
Flipping an element means changing its value from 0 to 1, and from 1 to 0.

Return the minimum number of operations required to make all elements in nums equal to 1. If it is impossible, return -1.

 

Example 1:

Input: nums = [0,1,1,1,0,0]

Output: 3

Explanation:
We can do the following operations:

Choose the elements at indices 0, 1 and 2. The resulting array is nums = [1,0,0,1,0,0].
Choose the elements at indices 1, 2 and 3. The resulting array is nums = [1,1,1,0,0,0].
Choose the elements at indices 3, 4 and 5. The resulting array is nums = [1,1,1,1,1,1].
Example 2:

Input: nums = [0,1,1,1]

Output: -1

Explanation:
It is impossible to make all elements equal to 1.*/
