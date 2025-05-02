package Arrays;
import java.util.*;
public class Merg_2_sorted_array {
	
	public static int[] fun(int[] arr1,int[] arr2)
	{
		int[] ans=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				ans[k++]=arr1[i++];
			}else
			{
				ans[k++]=arr2[j++];
			}
		}
		
		
		while(i<arr1.length)
		{
			ans[k++]+=arr1[i++];
		}
		
		while(j<arr2.length)
		{
			ans[k++]+=arr2[j++];
		}
		
		
		
		return ans;
	}

	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6};
		
		int[] ans=fun(arr1,arr2);
		System.out.println(Arrays.toString(ans));

	}

}
