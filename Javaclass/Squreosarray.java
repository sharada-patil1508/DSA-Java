package Javaclass;

import java.util.Arrays;

public class Squreosarray {

	public static void main(String[] args) {
		int[] arr= {-7,-3,2,3,11};
		int[] nums=fun(arr);
		System.out.println(Arrays.toString(nums));

	}
	static int[] fun(int[] nums)
	{
		
		int[] arr=new int[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			arr[i]=nums[i]*nums[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		return arr;
	}

}
