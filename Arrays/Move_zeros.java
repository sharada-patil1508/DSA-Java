package Arrays;
import java.util.*;
public class Move_zeros {
	
	
	public static int[] fun(int[] nums)
	{
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==0&&nums[nums.length-1]!=0)
			{
				int temp=nums[i];
				nums[i]=nums[nums.length-1];
				nums[nums.length-1]=temp;
			}
			
		}
		return nums;
	}

	public static void main(String[] args) {

		int[] arr= {0,1,0,3,12};
		
		int[] ans=fun(arr);
		System.out.println(Arrays.toString(ans));

	}

}
