package Inheritance;

public class Car {
	int a=2, b=9;
	
	
	Car()
	{
		System.out.println("i am indise car");
	}
	
	public void sum()
	{
		System.out.println(a+b);
	}

}

class c1 extends Car
{
	
	c1()
	{
		//super();
		System.out.println("i am inside c1");
	}
	
	
	
	public void sum(int c)
	{
		System.out.println(a+b+c);
	}
}

class c2 extends c1
{
	c2()
	{
		System.out.println("i am inside c2");
	}
	
	
	
}
