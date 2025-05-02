package Leetcode_problems;

public class Palindrom_string_array {
	  public static String firstPalindrome(String[] arr) {
		  String ans="";
		  String empty="";
			for(int i=0;i<arr.length;i++)
			{
				char[] arr1=arr[i].toCharArray();
				int m=0;
				int n=arr1.length;
				while(m<n)
				{
					if(arr1[m]==arr1[n])
					{
						ans+=arr1[m++];
					
					}else
					{
						return empty;
					}
				}
				
			}
			return ans;

	        
	    }

	public static void main(String[] args) {
		String[] arr= {"abc","uyt","oip","ada"};
	System.out.println(	firstPalindrome(arr));
		

	}

}
