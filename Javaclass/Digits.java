package Javaclass;

import java.util.Arrays;

public class Digits {

	public static void main(String[] args) {
		int[] arr= {98749876};
		plusOne(arr);
		System.out.println(Arrays.toString(plusOne(arr)));
		// TODO Auto-generated method stub

	}
	 public static int[] plusOne(int[] a) {
	        int num=0;
	        
	        for(int i=0;i<a.length;i++)
	        {
	            num=a[i]+num*10;
	        }
 int y=num+1;
	  
	     for(int i=0;i<a.length;i++)
	     {
	    	 int x=y%10;
	    	 a[i]=x;
	    	 y=y/10;
	     }
	
	   
	        return a;
	    }
	
	    
	    
	}


