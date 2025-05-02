package Arrays;
import java.util.*;
public class Rotate_an_Array {
	
	public  static int[] fun(int[] arr)
	{
		int[] ans=new int[arr.length];
		ans[0]=arr[arr.length-1];
		for(int i=1;i<arr.length;i++)
		{
			ans[i]=arr[i-1];
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(fun(arr)));

	}

}
