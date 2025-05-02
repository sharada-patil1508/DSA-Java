package Arrays;
import java.util.*;

//https://leetcode.com/problems/missing-number/
public class Missing_num_in_seq {
	
	public static int fun(int[] arr)
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+1==arr[i+1])
			{
				continue;
			}else
			{
				return arr[i]+1;
			}
		
		}
		 if(arr[0]==0){
				return arr[arr.length-1]+1;
		        }

		        return 0;
		
	}
	

	public static void main(String[] args){
		int[] arr= {3,0,1};
		int ans=fun(arr);
		System.out.println(ans);

	}

}
