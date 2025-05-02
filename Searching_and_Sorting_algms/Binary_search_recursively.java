package Searching_and_Sorting_algms;

public class Binary_search_recursively {
	
	public static boolean fun(int[] arr,int k,int s,int e)
	{
		
		while(s<=e)
		{
			int mid=s+(e-s)/2;
			
			if(arr[mid]==k)
			{
				return true;
			}
			if(k<arr[mid])
			{
				return fun(arr,k,s,e-1);
			}
			return fun(arr,k,s+1,e);
		}
		return false;
	}

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	
	if(fun(arr,50,0,arr.length-1))
	{
		System.out.println("ele found");
	}else
	{
		System.out.println("ele not found");
	}

	}

}
