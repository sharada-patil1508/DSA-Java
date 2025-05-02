package Javaclass;
//Write a function that returns all prime numbers between two given numbers.
public class Primenum {
	static int prime(int n,int m)
	{
		int i;
		for(i=n;i<=m;i++)
		{
			if(i%i==0)
			{
				return i;
			}
		}
		return 0;
		
	}

	public static void main(String[] args) {
		int n=1,m=9;
		System.out.println(prime(2,9));

	}

}
