package Javaclass;

import java.util.Arrays;

//https://leetcode.com/problems/height-checker/
public class Heighchecker {

	public static void main(String[] args) {
		int[] arr= {5,1,2,3,4};
	int x=	fun(arr);
		System.out.println(x);
		

	}
	static int fun(int[] arr)
	{
		int count=0;
		int[] nums=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			nums[i]=arr[i];
		}
		System.out.println(Arrays.toString(nums));
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
		
	for(int i=0;i<arr.length;i++)
	{
		if(nums[i]!=arr[i])
		{
			count++;
		}
	}
		
return count;
}
}
