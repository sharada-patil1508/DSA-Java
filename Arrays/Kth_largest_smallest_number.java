package Arrays;

public class Kth_largest_smallest_number {
	
	public static void fun(int[] arr,int k)
	{
		 int k_small=0,k_large=0;
		 for(int i=1;i<=arr.length;i++)
		 {
			 for(int j=i;j<arr.length-i;j++)
			 {
				 if(arr[j]<arr[j-1])
				 {
					 int temp=arr[j];
					 arr[j]=arr[j-1];
					 arr[j-1]=temp;
				 }
			 }
		 }
		 
		System.out.println("kth largestest ele:"+arr[arr.length-k]);
		System.out.println("kth  smallest ele:"+arr[k-1]);
		
	}

	public static void main(String[] args) {
		
		int[] arr= {7,10,4,3,20,15};
		fun(arr,3);
		
	}

}
