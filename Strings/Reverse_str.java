package Strings;
import java.util.*;
public class Reverse_str {
	
	public static void fun(String str)
	{
		String ans="";
		for(int i=str.length()-1;i>=0;i--)
		{
			ans+=str.charAt(i);
		}
		System.out.println(ans);
	}
	public static void main(String[] args)
	{
		String str="sharada";
		fun(str);
	}

}
