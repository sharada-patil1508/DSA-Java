package Javaclass;

public class Leetcode {
    public static int specialArray(int nums[]) {
        int n = nums.length;
        
        // Try all possible values of x from 0 to n
        for (int x = 0; x <= n; x++) {
            int count = 0;
            // Count how many numbers are greater than or equal to x
            for (int num : nums) {
                if (num >= x) {
                    count++;
                }
            }
            // If the count matches x, return x
            if (count == x) {
                return x;
            }
        }
        
        // If no such x exists, return -1
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {0, 4, 3, 0, 4};
        int res = specialArray(nums);
        System.out.println(res);  // Output should be 3
    }
}
