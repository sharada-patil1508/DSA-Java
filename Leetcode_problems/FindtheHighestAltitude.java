package Leetcode_problems;

import java.util.Arrays;

public class FindtheHighestAltitude {
//https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75
	public static void main(String[] args) {
		int arr[]= {-5,1,5,0,-7};
		int ans=largestAltitude(arr);
		System.out.println(ans);
		

	}
	public static int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        for(int i=1;i<=gain.length;i++)
        {
            arr[i]=arr[i-1]+gain[i-1];
        }
      int max=arr[0];
      for(int i=0;i<arr.length;i++)
      {
    	  if(max<arr[i])
    	  {
    		  max=arr[i];
    	  }
      }
      return max;
        
    }
	

}
