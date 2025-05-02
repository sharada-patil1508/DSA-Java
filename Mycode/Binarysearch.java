package Mycode;
import java.util.*;
public class Binarysearch {

	public static void main(String[] args) {
		int arr[]= {7,3,9,1,4,6,8};
		Arrays.sort(arr);
		int k=70;
		long start=System.nanoTime();
		int ans=fun(arr,k,0,arr.length-1);
		long end=System.nanoTime();	
		System.out.println("time complexity is:"+(end-start)+"ns");
		if(ans!=-1)
		{
			System.out.println("ele found at:"+ans);
		}
		else
		{
			System.out.println("ele not found");
		}
	}
	static int fun(int[] arr,int k,int start,int end)
	{
		if(start>end)
		{
			return -1;
		}
		int mid=start+(end-start)/2;
		if(arr[mid]==k)
		{
			return mid;
		}
		if(k<arr[mid])
		{
			return fun(arr,k,start,mid-1);
		}
		return fun(arr,k,mid+1,arr.length-1);
	}
			
}

		

	