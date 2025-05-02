package Leetcode_problems;

import java.util.*;

public class Swap__array_ele {

	public static int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int count = 0; // Track the number of swaps
        for (int i = 0; i < nums.length - 1 && count < limit; i++) {
            if (nums[i] > nums[i + 1]) {
                // Swap elements to make the array smaller
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                count++;
                // Restart the loop to maintain lexicographical order
                i = -1; 
            }
        }
        return nums;
    }
    

    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 9, 8 };
        int limit = 2;

        int[] ans = lexicographicallySmallestArray(arr, limit);
        System.out.println(Arrays.toString(ans));
    }
}
