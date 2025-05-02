package Arrays;
import java.util.*;
public class Rev_n_array {
	
	public static int[] fun(int[] arr)
	{
		int[] ans=new int[arr.length];
		int j=0;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			ans[j++]=arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] ans=fun(arr);
		System.out.println(Arrays.toString(ans));
	}

}
