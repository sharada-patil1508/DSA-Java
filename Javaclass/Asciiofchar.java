package Javaclass;
import java.util.*;
public class Asciiofchar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
	getascii(str);
		
	}
	static void getascii(String str)
	{
		int ans=0;
		for(int i=0;i<str.length()-1;i++)
		{
			//char character=str.charAt(i);
			//int asciivalue=(int)character;
			//System.out.println(asciivalue);
			
		
			//In Java, the Math.abs method is used to return the absolute value of a given number
		    int m= Math.abs((int)(str.charAt(i)) -(int)(str.charAt(i+1)));
		    ans=ans+m;
		    	
		}
		System.out.println(ans);
		
	}

}
