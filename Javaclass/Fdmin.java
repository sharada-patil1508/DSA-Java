package Javaclass;

public class Fdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,5,1,2};
		int x=fun(arr);

	}
	static int fun(int[] arr)
	{
		  int min=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i]<min)
	            {
	                min=arr[i];
	            }
	        }
	        return min;
	}

}
