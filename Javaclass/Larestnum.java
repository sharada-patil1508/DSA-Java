package Javaclass;

public class Larestnum {

	public static void main(String[] args) {
		int nums[]= {3,30,34,5,9};
		fun(nums);

	}
	static void fun(int[] nums)
	{
		StringBuilder ans=new StringBuilder();
		int arr[]=new int[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]<10)
			{
				arr[i]=nums[i];
			}
			if(nums[i]>=10)
			{
				int len=0;
				while(nums[i]!=0)
				{
					nums[i]=nums[i]/10;
					len++;
				}
				int rem=nums[i]%10;
				for(int j=i;j<len;j++)
				{
					arr[j]=rem;
				}
				nums[i]=nums[i]/10;
				
			}
		}
		
		System.out.println(arr);
	}

}
