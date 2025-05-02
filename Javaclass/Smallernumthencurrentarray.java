package Javaclass;
import java .util.*;

public class Smallernumthencurrentarray {
	public static void main(String[] args)
	{
		  int nums[] = {8, 1, 2, 2, 3};
		int[] res=small(nums);
		System.out.println(Arrays.toString(res));
	}
	static int[] small(int[] nums)
	{
		
		  int[] res = new int[nums.length];
	
		for(int i=0;i<nums.length;i++)
			  
		{
			int count = 0; // Reset count for each element
			for(int j=0;j<nums.length;j++)
			{
				if(i!=j&&nums[i]>nums[j])
				{
					count++;
				}
				
				
			}
			res[i]=count;
		}
		return res;
		
	}

}
