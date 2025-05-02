package Arrays;

public class Peak_ele_small_then_neighbors {
	public static int fun(int[] arr)
	{
		int ans=0;
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
			{
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {10,15,25,23,90,90};
		System.out.println(fun(arr));
	}

}
