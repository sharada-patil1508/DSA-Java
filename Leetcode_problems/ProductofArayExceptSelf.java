package Leetcode_problems;
//https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
import java.util.Arrays;

public class ProductofArayExceptSelf {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		productExceptSelf(arr);
		

	}
	 public static void productExceptSelf(int[] nums) 
	 {
		 int[] ans=new int[nums.length];
		
	        for(int i=0;i<nums.length;i++)
	        {
	        	 int mul=1;
	        	for(int j=1;j<nums.length;j++)
	        	{
	        		if(i==j)
	        			continue;
	        		mul*=nums[j];
	        		
	        	}
	        	ans[i]=mul;
	        }
	       System.out.println(Arrays.toString(ans));
	 }

}
