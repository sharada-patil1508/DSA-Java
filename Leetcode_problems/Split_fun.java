package Leetcode_problems;

public class Split_fun {

	public static void main(String[] args) {
		String s1="sharada";
		String s2="patil";
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		String ans="";
		int i=0;
		int j=0;
		while(i<s1.length()&&j<s2.length()) {
			ans+=arr1[i++];
			ans+=arr2[j++];
		}
		while(i<s1.length())
		{
			ans+=arr1[i++];
					
		}
		while(i<s2.length())
		{
			ans+=arr2[j++];
					
		}
		System.out.println(ans);

	}

}
