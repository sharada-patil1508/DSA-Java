package Javaclass;

public class Validsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=3;
		boolean x=square(num);
		System.out.println(x);

	}
	static boolean square(long num)
	{
		for(int i=1;i<=num;i++)
		{
			if(i*i==num)
			{
				return true;
			}
		}
		return false;
	}
	
	//using bi

}
