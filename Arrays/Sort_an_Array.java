package Arrays;
import java.util.*;
public class Sort_an_Array {

	public static int[] sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
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
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= {7,5,8,1,4,9};
		System.out.println(Arrays.toString(sort(arr)));

	}

}
