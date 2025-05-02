package Baisc_prgms;
import java.util.*;

public class Rev_str {
	
	public static void fun(String str)
	{
		String ans=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			ans+=str.charAt(i);
		}
		System.out.println(ans);
	}
	
	public static int fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
		
		return fib(n-1)+fib(n-2);
	}
	
	public static int fact(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		
		return n*fact(n-1);
	}
	
	public static boolean ispal(String str)
	{
		String org=str;
		String ans="";
		for(int i=str.length()-1;i>=0;i--)
		{
			ans+=str.charAt(i);
		}
		
		if(!org.equals(ans))
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//fun(str);
		
		for(int i=0;i<=5;i++)
		{
			//System.out.println(fib(i));
		}
		
		//int ans=fact(5);
		//System.out.println(ans);
		
	boolean ans=ispal(str);
		System.out.println(ans);
		
		
		

	}

}
