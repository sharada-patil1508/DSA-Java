package Arrays;
import java.util.*;
public class Count_pair_with_given_sum {
	public static ArrayList<ArrayList<Integer>>  fun(int[] arr,int k)
	{
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==k)
				{
					ArrayList<Integer> innerlist=new ArrayList<>();
					innerlist.add(arr[i]);
					innerlist.add(arr[j]);
					list.add(innerlist);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr= {1,1,1,1};
		System.out.println(fun(arr,2));

	}

}
