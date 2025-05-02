package Mycode;

import java.util.Arrays;

public class Mergsort {

	public static void main(String[] args) {
		int[] arr= {8,1,5,0,3,5,-78,2,-34};
		arr=mergsort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static int[] mergsort(int[] arr)
	{
		if(arr.length==1)
		{
			return arr;
		}
		int mid=arr.length/2;
		int[] left=mergsort(Arrays.copyOfRange(arr,0, mid));
		int[] right=mergsort(Arrays.copyOfRange(arr, mid, arr.length));
		return merg(left ,right);
	}
	
	static int[] merg(int[] first,int[] second)
	{
		int[] mix=new int[first.length+second.length];
		int i=0,j=0,k=0;
		while(i<first.length&&j<second.length)
		{
			if(first[i]<second[j])
			{
				mix[k]=first[i];
				i++;
			}
			else
			{
				mix[k]=second[j];
				j++;
			}
			k++;
		}
		
		while(i<first.length)
		{
			mix[k]=first[i];
			i++;
			k++;
			j++;
		}
		
		while(j<second.length)
		{
			mix[k]=second[j];
			i++;
			j++;
			k++;
		}
		return mix;
	}
	

}
