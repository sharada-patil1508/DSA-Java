package Baisc_prgms;

public class Fibonachi {
	public static  int fun(int n)
	{
		if(n<=1) {
			return n;
		}
		return fun(n-1)+fun(n-2);
	}

	public static void main(String[] args) {
		int n=10;
		System.out.println("fib series is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(fun(i));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
