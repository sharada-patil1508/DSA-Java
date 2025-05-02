
package Leetcode_problems;
//leetcode.com/problems/longest-common-subsequence/?envType=study-plan-v2&envId=leetcode-75
public class Longest_comman_subsequence {

	public static  int longestCommonSubsequence(String text1, String text2)
	{
		int count=0;
		char[] s1=text1.toCharArray();
		char[] s2=text2.toCharArray();
		int i=0,j=0;
		while(text1.length()!=0&&text2.length()!=0) {
		if(s1[i]==s2[j])
		{
			i++;
			j++;
			count++;
		}else
		{
			  i++;
		}
		
		}
		return count;
    }

	public static void main(String[] args) {
		String s="abcde";
		String t="ace";
		int ans=longestCommonSubsequence(s,t);
		System.out.println(ans);
		
		
	}

}
