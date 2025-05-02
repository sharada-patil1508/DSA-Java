package Leetcode_problems;

public class Reverse_string {
	public static boolean fun(String s,String t)
	{
		String ans="";
		// StringBuilder ans = new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
		{
			ans+=s.charAt(i);
			// ans.append(s.charAt(i));
		}
		
		//System.out.println(ans);
		int index=t.indexOf(ans);
		if(index!=-1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	

	public static void main(String[] args) {
		String s="uyt";
		String t="sharada";
	
		boolean ans=fun(s,t);	
		System.out.println(ans);
		
 
	}

}
