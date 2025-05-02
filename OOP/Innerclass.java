package OOP;

public class Innerclass {
	
	//here remove static and see   and also put this class outside
	
	//whenever we make this class as static the it is not depending on the above class
	
	static class test
	{
		String name;
		public test(String name)
		{
			this.name=name;
		}
	}
	
	public static void main(String[] args)
	{
		test a=new test("sharada");
		test b=new test("patil");
		
		System.out.println(a.name);
		System.out.println(b.name);
		
	}
	

}
