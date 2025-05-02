package Javaclass;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		int arr[]= {1,2};
		fun(arr);
		System.out.println(Arrays.toString(arr));
		int ans=fun(arr);
		System.out.println(ans);
		// TODO Auto-generated method stub

	}
	static int fun(int[] arr)
	{
		
		while(arr.length<=2)
		{
			int max=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(max<arr[i])
				{
					max=i;
				}
			}
			return max;
		}
		while(arr.length>2)
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
		return arr[0];
		
	}
	

}
