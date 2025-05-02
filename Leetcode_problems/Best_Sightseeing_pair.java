package Leetcode_problems;
import java.util.*;

public class Best_Sightseeing_pair {
	
 public static int maxScoreSightseeingPair(int[] values) {
	 int sum=0;
	 int ans=0;
	 for(int i=0;i<values.length-1;i++)
	 {
		 
		 for(int j=i+1;j<values.length;j++)
		 {
			
				 ans=values[i] + values[j]+i-j; 
			 
			 if(sum<ans)
			 {
				 sum=ans;
			 }
		 }
	 }
	 return sum;
	 
        
    }
	public static void main(String[] args) {
		int arr[]= {8,1,5,2,6};	
		int ans=maxScoreSightseeingPair(arr);
		System.out.println(ans);

	}

}
