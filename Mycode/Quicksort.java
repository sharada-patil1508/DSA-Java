package Mycode;

import java.util.Arrays;
public class Quicksort {

	public static void main(String[] args) {
		int arr[]= {8,1,5,9,3};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	static void sort(int[] num,int low,int hig)
	{
		if(low>=hig)
		{
			return;
		}
		int s=low;
		int e=hig;
		int mid=s+(e-s)/2;
		int pivote=num[mid];
		while(s<=e)
		{
			while(num[s]<pivote)
			{
				s++;
			}
			while(num[e]>pivote)
			{
				e--;
			}
			if(s<=e)
			{
				int temp=num[s];
				num[s]=num[e];
				num[e]=temp;
				s++;
				e--;
			}
		}
		sort(num,low,e);
		sort(num,s,hig);
		
	}

}
