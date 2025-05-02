package Arrays;
import java.util.*;
public class Kth_MAX_MIN_ELE {
	public static void fun(int[] arr,int k)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[arr.length-k]);
	}

	public static void main(String[] args) {
		
		int[] arr= {11,12,13,90,45};
		int k=3;
		fun(arr,k);
		
	}

}
