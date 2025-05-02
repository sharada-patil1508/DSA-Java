package Arrays;
import java.util.*;
public class Reverse_Array {
	
	public static int[] rev(int[] arr)
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
		System.out.println(Arrays.toString(rev(arr)));

	}

}
