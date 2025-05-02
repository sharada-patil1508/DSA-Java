package Leetcode_problems;
import java.util.*;
//https://leetcode.com/problems/max-consecutive-ones/


public class max_cons_1s {
	public static  int findMaxConsecutiveOnes(int[] nums) {
		
		int max=0;
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==1)
			{
				count++;
				if(i==nums.length-1&&max<count)
				{
					max=count;
				}
			}else
				{
					if(max<count)
					{
						max=count;
					}
					count=0;
				}
			}
			
			
		return max;
		
	    
	}
	
	public static void main(String[] args)
	{
		int nums[]= {1,1,0,1,1,1};
		int ans=findMaxConsecutiveOnes(nums);
		System.out.println(ans);
	}

}
