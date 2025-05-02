package Mycode;
import java.util.*;
public class Bubblesort{
	public static void main(String args[])
	{
		int arr[]= {9,-9,9,34,7,2,8,12};
		long start=System.nanoTime();
		sort(arr);
		System.out.println(Arrays.toString(arr));
		long end=System.nanoTime();
		System.out.println("the time compexity is :"+(end-start)+"ns");
		
	}
	static void sort(int[] arr)
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
	

}
