package Leetcode_problems;
import java.util.*;
public class Recoloring_W_B {
	
	 public  static int minimumRecolors(String blocks, int k) {
		 
		 int ans=0;
		 String newstr=" ";
		 for(int i=0;i<blocks.length();i++)
		 {
			 char x=blocks.charAt(i);
			 if(x=='W'&&ans!=k) {
			newstr.replace('W', 'B');
			ans++;
			 }
		 }
		// System.out.println(newstr);
		 return ans;
	    }

	public static void main(String[] args) {
		String s="WBBWWBBWBW";
		int k=7;
	System.out.println(minimumRecolors(s,k));
		
		

	}

}
