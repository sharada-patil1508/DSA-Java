package OOP;

public interface Test {
	
	//final int a=10;
	
	int add(int a,int b);

}
class A implements Test,Test2
{
	public int add(int a,int b)
	{
		return a+b;
	}
}

class B extends A
{
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
}

