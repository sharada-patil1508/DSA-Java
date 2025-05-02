package Javaclass;

public class Numofdigits {

	public static void main(String[] args) {
		int x=2345;
		int count=0;
		while(x!=0)
		{
			x=x/10;
			count++;
			
			
		}
		System.out.println(count);

	}

}
