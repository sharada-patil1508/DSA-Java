package Leetcode_problems;
//https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class Uniquenumberof {

	public static void main(String[] args) {
		int[] arr= {1,2,2,1,1,3};
		fun(arr);

	}
	static void fun(int[] arr)
	{
		int[] ans=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				ans[i]=count;
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
