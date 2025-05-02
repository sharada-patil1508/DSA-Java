package Leetcode_problems;

import java.util.Arrays;

public class Kth_large_element {
	
	public static int fun(int[] nums,int k)
	{
		sort(nums);
	
		return nums[k-1];
	}
	public static void sort(int[] nums)
	{
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=1;j<nums.length-i;j++)
			{
				if(nums[j]>nums[j-1])
				{
					int temp=nums[j];
					nums[j]=nums[j-1];
					nums[j-1]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		
	}

	public static void main(String[] args) {
		int[] nums= {3,2,1,5,6,4};
	System.out.println(	fun(nums,2));

	}


}
