package OOP;

public class Oop1 {
	
	int a;
	int b;
	
	public void sum()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Oop1 obj=new Oop1();
		
		obj.a=2;
		obj.b=3;
		obj.sum();

	}

}
