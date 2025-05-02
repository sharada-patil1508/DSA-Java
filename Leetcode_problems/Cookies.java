package Leetcode_problems;
//https://leetcode.com/problems/assign-cookies/description/
import java.util.*;
public class Cookies {
	 public static int findContentChildren(int[] g, int[] s) {
		 int cookiesnum=s.length;
		 if(cookiesnum==0)
		 {
			 return 0;
		 }
		 Arrays.sort(s);
		 Arrays.sort(g);
		 int maxnum=0;
		 int cookiesindex=s.length-1;
		 int childindex=g.length-1;
		 while(cookiesindex>=0&&childindex>=0)
		 {
			 if(s[cookiesindex]>=g[childindex])
			 {
				maxnum++;
				cookiesindex--;
				childindex--;
			 }else
			 {
				 childindex--; 
			 }
		 }

	        return maxnum;
	    }

	public static void main(String[] args) {
		int[] g= {1,2,3};
		int[] s= {1,1};
		int ans=findContentChildren(g,s);
		System.out.println(ans);

	}

}
