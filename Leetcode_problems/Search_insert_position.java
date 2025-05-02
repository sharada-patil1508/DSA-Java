package Leetcode_problems;

import java.util.Arrays;

//https://leetcode.com/problems/search-insert-position/description/?envType=study-plan-v2&envId=top-interview-150
public class Search_insert_position {
	
	public static int search(int[] nums,int k)
	{
		int ans=0;
		if(nums.length!=0) {
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==k)
			{
				ans=i;
			}
		}
		}else
		{
			ans=fun(nums,k);
		}
		return ans;
		
	}
	
	public static int fun(int[] nums,int k)
	{ 
		int ans=0;
		int[] arr=new int[nums.length+1];
		for(int i=0;i<nums.length;i++)
		{
			arr[i]=nums[i];
		}
		arr[nums.length]=k;
		System.out.println(Arrays.toString(arr));
		sort(arr); 
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==k)
			{
				ans=i;
			}
		}
		return ans;
		
	}
	public static void sort(int[] arr)
	{
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
	}

	public static void main(String[] args) {
		int[] nums= {1,3,5,6};
		int k=8;
		System.out.println(search(nums,k));

	}

}
