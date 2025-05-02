package Arrays;

public class Find_min_max_ele {
	
	public static int maxfun(int[] arr)
	{
		int max=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int minfun(int[] arr)
	{
		int min=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]>arr[i])
			{
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] arr= {4,6,2,3,8,9};
		int max=maxfun(arr);
		int min=minfun(arr);
		System.out.println(max+" "+min);
	}

}
