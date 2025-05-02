package Leetcode_problems;

public class Space_in_String {
	
	 public  static String addSpaces(String s, int[] spaces) {
		 
		 String ans="";
		 for(int i=0;i<s.length();i++)
		 {
			 ans+=s.charAt(i);
			 for(int j=0;j<spaces.length;j++) {
			 if(i==spaces[j]-1)
			 {
				 ans+=" ";
			 }
			 }
		 }
		 
		 return ans;
	        
	    }

	public static void main(String[] args) {
		 String original = "LeetcodeHelpsMeLearn";
	        int[] arr= {8,13,15};
	       String ans= addSpaces(original, arr) ;
	       System.out.println(ans);
	        
	        
	        	

	}

}
