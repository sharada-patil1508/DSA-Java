package Leetcode_problems;
//https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class MergStringAlternately {

	public static void main(String[] args) {
		String str1="abc";
		String str2="pqr";
		String ans=fun(str1,str2);
		System.out.println(ans);

	}
	static String fun(String str1,String str2)
	{
		String ans="";
		char s1[]=str1.toCharArray();
		char s2[]=str2.toCharArray();
		int i=0,j=0;
		while(i<str1.length()&&j<str2.length())
		{
			ans+=s1[i++];
			ans+=s2[j++];
		}
		while(i<str1.length())
		{
			ans+=s1[i++];
		}
		while(j<str2.length())
		{
			ans+=s2[i++];
		}
		
		return ans;
	}

}
