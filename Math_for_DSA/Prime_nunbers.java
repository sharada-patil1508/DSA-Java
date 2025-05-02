package Math_for_DSA;

public class Prime_nunbers {
	
	public static boolean isPrime(int n)
	{
		 if(n<=1)
		 {
			 return false;
		 }
		 
		 int c=2;
		 while(c*c<=n)
		 {
			 if(n%c==0)
			 {
				 return false;
			 }
			 
			 c++;
		 }
		 
		 return true;
	}

	public static void main(String[] args) {
		/*int num=5;
		
		boolean ans=isPrime(num);
	
		if(ans)
		{
			System.out.println("the num is prime");
		}else
		{
			System.out.println("not a prime num");
		}*/
		
		int n=20;
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+"  "+isPrime(i));
			
		}

	}

}
 