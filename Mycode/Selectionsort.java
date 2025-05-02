package Mycode;
import java.util.*;
public class Selectionsort {
	public static void main(String args[])
	{
		int[] arr={3,1,4,2,-8,-11,12,-9,-1,99,-76};
		long start=System.nanoTime();
		sort(arr);
		System.out.println(Arrays.toString(arr));
		long end=System.nanoTime();
		System.out.println("time complexity "+(end-start)+"ns");
	}
	
	static void sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
		int end=arr.length-i;
		int x=max(arr,0,end);
		swap(arr,x,end-1);
		
	
		}
	}

	private static int max(int[] arr,int start,int last)
	{
		int maxele=start;
		for(int i=0;i<last;i++)
		{
			if(arr[maxele]<arr[i])
			{
				maxele=i;
			}
		}
		return maxele;
	}
	
	static void swap(int[] arr,int first,int last)
	{
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
	}
	

}
