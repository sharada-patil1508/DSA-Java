package Leetcode_problems;
//https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75

public class FindPivotIndex {

	public static void main(String[] args) {
		int[] arr= {1,7,3,6,5,6};
		int x=pivotIndex(arr);
		System.out.println(x);
	}
	static int pivotIndex(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			int lsum=0,rsum=0;
			for(int j=0;j<i;j++)
			{
				lsum+=nums[j];
			}
			for(int j=i+1;j<nums.length;j++)
			{
				rsum+=nums[j];
			}
			if(lsum==rsum)
			{
				return i;
			}
		}
		return -1;
	}

}
