package Leetcode_problems;
//https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75
public class Maxavgsubaray {

	public static void main(String[] args) {
		int[] arr= {0,1,1,3,3}; 
		int k=4;
		double ans=findMaxAvg(arr,k);
		System.out.println(ans);
		//System.out.println(arr.length);
		
	}
	public static double findMaxAvg(int[] nums,int k)
	{
		double max=0;
		double sum;
		double avg=0;
		for(int i=0;i<=nums.length-k;i++)
		{
			sum=0;
			for(int j=i;j<i+k;j++)
			{
				sum+=nums[j];
			}
			avg=sum/k;
			if(max<avg)
			{
				max=avg;
			}
		}
		return max;

	}
	
}
