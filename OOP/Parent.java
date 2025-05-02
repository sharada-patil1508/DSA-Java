package OOP;

public abstract class Parent {
	int age;
	
	
	abstract void career();
	abstract void partner();
	static void st()
	{
		System.out.println("i am inside static");
	}
	

}
 class son extends Parent
{
	
	@Override
	void career()
	{
		System.out.println("i am inside son career");
	}
	@Override
	
	void partner()
	{
		System.out.println("i am inside son partener");
	}
	
	
}
 class Doughter extends Parent
 {

	
		@Override
		void career()
		{
			System.out.println("i am inside Doughter career");
		}
		@Override
		
		void partner()
		{
			System.out.println("i am inside Doughter partener");
		}
	 
 }
