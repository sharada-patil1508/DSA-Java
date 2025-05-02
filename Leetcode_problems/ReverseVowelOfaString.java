package Leetcode_problems;
import java.util.*;
//https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
public class ReverseVowelOfaString {

	public static void main(String[] args) {
		String str="leetcode";
		String ans=fun(str);
		System.out.println(ans);
	}
	static String fun(String s)
	{
		char[] word=s.toCharArray();
		int start=0;
		int end=s.length()-1;
		String vowel="aeiouAEIOU";
		while(start<end)
		{
			while(start<end&&vowel.indexOf(word[start])==-1)
			{
				start++;
			}
			while(start<end&&vowel.indexOf(word[end])==-1)
			{
				end--;
			}
			char temp=word[start];
			word[start]=word[end];
			word[end]=temp;
			start++;
			end--;
		}
		String ans=new String(word);
		return ans;
	}

}
