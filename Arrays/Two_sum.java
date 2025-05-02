package Arrays;
import java.util.*;
public class Two_sum {
	
	public static int[] fun(int[] arr,int target)
	{
		
		int[] ans=new int[2];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					ans[0]=i;
					ans[1]=j;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int[] arr= {3,3};
		int k=6;
		int[] ans=fun(arr,k);
		System.out.println(Arrays.toString(ans));

	}

}
