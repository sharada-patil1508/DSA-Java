package Arrays;
import java.util.*;
public class Nth_largest_ele {
	
	public static void fun(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void  nth_ele(int[] arr,int n)
	{
		//int[] ans=fun(arr);
		//System.out.println(Arrays.toString(ans));
		System.out.println(arr[n-1]);
	}

	public static void main(String[] args) {
		int[] arr= {1,0,2};
		fun(arr);
	//	nth_ele(arr,3);

	}

}
