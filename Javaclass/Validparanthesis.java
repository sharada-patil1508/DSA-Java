package Javaclass;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Validparanthesis {

	public static void main(String[] args) {
		int nums[]= {1,1,2};
		int res=removeduplicates(nums);
		System.out.println(res);
		
	
	}
	static int removeduplicates(int[] nums)
	{
		int count=0;
		int j=0;
		if(nums.length==0)
			return 0;
		
		for(int i=1;i<nums.length;i++)
		{
				if(nums[i]!=nums[j])
				{
					count++;
					nums[j]=nums[i];
					
				}
			
			
		}
		return count+1;
	}

}





























