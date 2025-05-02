package Searching_and_Sorting_algms;

public class Linear_s {

	public static boolean fun(int[] arr,int k)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==k)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]= {7,1,4,9,3,5};
	
		if(fun(arr,9))
		{
			System.out.println("ele found");
		}else
		{
			System.out.println("ele not found");
		}

	}




}
