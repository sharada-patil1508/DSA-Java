package Mycode;
import java.util.*;
public class selectionsort2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		long start=System.nanoTime();
		sort(arr);
		System.out.println(Arrays.toString(arr));
		long end=System.nanoTime();
		System.out.println("the time complexity is :"+(end-start)+"ns");
	}
	static void sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int end=arr.length-i;
			int maxindex=getmax(arr,0,end);
			swap(arr,maxindex,arr.length-1-i);
		}
	}
	static int getmax(int[] arr,int start,int end)
	{
		int max=start;
		for(int i=0;i<end;i++)
		{
			if(arr[max]<arr[i])
			{
				max=i;
			}
		}
		return max;
	}
	static void  swap(int[] arr,int first,int second)
	{
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
		
	}

}
