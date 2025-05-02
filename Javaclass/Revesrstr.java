package Javaclass;
import java.util.*;

public class Revesrstr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int v=0,c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='i')
			{
				v++;
			}
			else
			{
				c++;
			}
		}
		System.out.println(v+" "+c);
		
	}
}
