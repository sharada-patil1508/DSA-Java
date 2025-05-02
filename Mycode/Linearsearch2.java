package Mycode;
import java.util.*;
public class Linearsearch2 {
	public static void main(String args[])
	{
		int arr[]= {9,1,45,7,3};
		int k=8;
		long start=System.nanoTime();
		int ans=fun(arr,k);
		long end=System.nanoTime();
		if(ans!=-1)
		{
			System.out.println("ele found at index:"+ans);
		}
		else
		{
			System.out.println("ele not found");
		}
		
	}
	static int fun(int[] arr,int k)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]==k)
			{
				return i;
			}
		}
		return -1;
	}

}
