package Javaclass;
import java.util.*;
//https://leetcode.com/problems/count-the-number-of-special-characters-i/description/
public class Bothuplocase {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int ans=fun(str);
		System.out.println(ans);

	}
	static int fun(String str)
	{
		int count=0;
		boolean[] lowercase=new boolean[26];
		boolean[] uppercase=new boolean[26];
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch))
			{
				lowercase[ch-'a']=true;
			}
			if(Character.isUpperCase(ch))
			{
				uppercase[ch-'A']=true;
				
			}
			
		}
		for(int i=0;i<26;i++)
		{
			if(lowercase[i]&&uppercase[i])
			{
				count++;
			}
		}
		return count;
		
	}

}
