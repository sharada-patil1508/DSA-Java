package Arrays;

public class Sort_without_sort_algm {
	public static void fun(int[] arr)
	{
		int[] arr1=new int[arr.length];
		int[] arr2=new int[arr.length];
		int[] arr3=new int[arr.length];
		int i=0;
		int j=0;
		for( i=0;i<arr.length;i++);
		{
			if(arr[i]==0)
			{
				arr1[j++]=arr[i];
			}
			if(arr[i]==1)
			{
				arr2[j++]=arr[i];
			}
			if(arr[i]==3)
			{
				arr1[j++]=arr[i];
			}
		}
		int ans[]=new int[arr.length];
	}

	public static void main(String[] args) {
		int[] arr= {0, 1, 2, 0, 1, 2};
		fun(arr);

	}

}
