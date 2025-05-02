package Leetcode_problems;

import java.util.Arrays;

public class Mergstringalternattrly {

	public static void main(String[] args) {
		String s1="sharada";
		String s2="patil";
		String ans=fun(s1,s2);
		System.out.println(ans);
		

	}
	public static String fun(String s1,String s2)
	{
		String ans="";
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		int i=0,j=0;
		while(i<s1.length()&&j<s2.length())
		{
			ans+=arr1[i++];
			ans+=arr2[j++];
		}
		while(i<s1.length())
		{
			ans+=arr1[i++];
		}
		while(j<s2.length())
		{
			ans+=arr2[j++];
		}
		return ans;
	}

}
