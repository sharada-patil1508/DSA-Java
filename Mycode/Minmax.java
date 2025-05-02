package Mycode;
import java.util.*;

public class Minmax {
	public static void main(String args[])
	{
	/*	Random rand=new Random();
		int n=10;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=rand.nextInt(100);
		}*/
		int arr[]= {9,6,3,8,2};
		
		long start=System.nanoTime();
		int min=fun(arr);
		int max=fun2(arr);
		System.out.println("min ele is :"+min);
		System.out.println("max ele is :"+max);
		
	}
	static int fun(int[] arr)
	{
		int min=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[min]>arr[i])
			{
				arr[min]=arr[i];
			}
		}
		return arr[min];
	}
	static int fun2(int[] arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[max]<arr[i])
			{
				arr[max]=arr[i];
			}
		}
		return arr[max];
	}

}
