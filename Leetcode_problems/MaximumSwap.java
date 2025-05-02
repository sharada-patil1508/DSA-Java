package Leetcode_problems;
import java.util.*;
public class MaximumSwap {
	
	

	public static int fun(int num) {
		 int rem=num;
		 int count=0;
		 while(rem!=0)
		 {
			 rem=rem/10;
			 count++;
			
		 } 
		 int[] arr=new int[count];
		 for(int i=0;i<count;i++)
		 {
			 int r=num%10;
			 arr[i]=r;
			 num=num/10;
			 
		 }
		 int max=0;
		 int mindex=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>max)
			 {
				 max=arr[i];
				 mindex=i;
			 }
		 }
		 if(mindex!=-1&&mindex!=0)
		 {
			 int temp=arr[0];
			 arr[0]=arr[mindex];
			 arr[mindex]=temp;
		 }
		 int number=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 number=number*10+arr[i];
		 }
		 
	      return number;
	    }

	public static void main(String[] args) {
		int num=2736;
		
		System.out.println((fun(num)));
	}

}
