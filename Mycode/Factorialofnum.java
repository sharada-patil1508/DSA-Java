package Mycode;
import java.util.*;
public class Factorialofnum {

	public static void main(String[] args) {
		int fact=1;
		int n=0;
		long start=System.nanoTime();
		fact=fun(n);
		long end=System.nanoTime();
		System.out.println("the time compelexity is"+(end-start)+"ns");
		System.out.println(fact);
		
	}
	static int fun(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
	return (n*fun(n-1));
		}
	}

}
