package Leetcode_problems;

public class Prifx_Match {

	public static void main(String[] args) {
	
		String[] str= {"sharada","shpatil","bnmit","shbeng"};
		String pef="sh";
		int count=0;
		for(int i=0;i<str.length;i++)
		{
		String 	s=str[i];
		if(s.contains(pef))
		{
			count++;
		}
			
		}
		System.out.println(count);
		
	}

}
