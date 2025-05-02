package Leetcode_problems;

public class Count_the_Nuber_of_Fair_Pairs {
	public static long fun(int nums[],int l,int u)
	{
		long ans=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				int sum=nums[i]+nums[j];
				if(sum>=l&&sum<=u)
				{
					ans++;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr= {0,1,7,4,4,5};
		int l=3,u=6;
		System.out.println(fun(arr,l,u));
	}

}
