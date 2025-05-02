package Leetcode_problems;
//https://leetcode.com/problems/separate-black-and-white-balls/
public class Swap_0and1 {
	  public static long minimumSteps(String s) {
	        long ans=0;
	        long zeroc=0;
	        for(int i=s.length()-1;i>=0;i--)
	        {
	            char ch=s.charAt(i);
	            if(ch=='0')
	            {
	                zeroc++;
	            }
	            else if(ch=='1')
	            {
	                ans+=zeroc;
	            }
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		String str="00101";
		long ans=minimumSteps(str);
		System.out.println(ans);
		
	}

}
