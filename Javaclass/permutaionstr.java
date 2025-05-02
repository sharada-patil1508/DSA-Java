package Javaclass;
//https://leetcode.com/problems/permutation-difference-between-two-strings/
import java.util.*;
public class permutaionstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int ans=fun(s,t);
		System.out.println(ans);

	}
	static int fun(String s,String t)
	{
		int ans=0;
				for(int i=0;i<s.length();i++)
				{
					char ch=s.charAt(i);
					for(int j=0;j<t.length();j++)
					{
						if(ch==t.charAt(j))
							
						{
							if(i>j)
							{
							ans=ans+((i-j));
							}
							else
							{
								ans=ans+((j-i));
							}
							
						}
					}
					
				}
				return ans;
	}

}
