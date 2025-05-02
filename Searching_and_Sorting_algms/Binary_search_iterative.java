package Searching_and_Sorting_algms;

public class Binary_search_iterative {
	
	public static boolean fun(int[] arr,int k)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(k==arr[mid])
			{
				return true;
			}
			if(k<arr[mid])
			{
				end=mid-1;
			}
			
			if(k>arr[mid])
			{
				start=mid+1;
			}
			
			
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		
		if(fun(arr,61))
		{
			System.out.println("ele found");
		}else
		{
			System.out.println("ele not found");
		}
		
		

	}

}
