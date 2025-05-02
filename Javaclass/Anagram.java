package Javaclass;
import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		fun(str1,str2);
		
	}
	static void fun(String str1,String str2)
	{
		int c1=0,c2=0;
		for(int i=0;i<str1.length()-1;i++)
		{
			char ch=str1.charAt(i);
			c1++;
			for(int j=0;j<str2.length()-1;j++)
			{
				if(ch==str2.charAt(j))
				{
					c2++;
				}
			}
			
		}
		if(c1==c2)
		{
			System.out.println("strings are anagram");
		}else
		{
			System.out.println("not anagrams");
		}
	}

}
