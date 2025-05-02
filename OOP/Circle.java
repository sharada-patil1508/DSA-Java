package OOP;

public class Circle {
	
	void area()
	{
		System.out.println("i am in circle");
	}

	int sun(int a,int b)
	{
		return a+b;
	}
	
	int sun(int a,int b,int c)
	{
		return a+b+c;
	}
}
class  shape extends Circle
{
		void area()
	{
		System.out.println("i am in shape");
	}
}
