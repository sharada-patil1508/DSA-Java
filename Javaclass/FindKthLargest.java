package Javaclass;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class FindKthLargest {

	public static void main(String[] args) {
		int[] arr= {3,2,1,5,6,4};
		int k=2;
		int x=fun(arr,k);
		System.out.println(x);

	}
	static int fun(int[] nums,int k)
	{
		for(int i=0;i<nums.length;i++)
		{
			for(int j=1;j<nums.length-i;j++)
			{
				if(nums[j]<nums[j-1])
				{
					int temp=nums[j];
					nums[j]=nums[j-1];
					nums[j-1]=temp;
				}
			}
		}
		return nums[k-1];
	}

}
