package OOP;


//this is a demo initialisation of static variable
public class StaticInt {
	
	static int a=4;
	static int b;
	//it only uruns once
	static 
	{
		System.out.println("i am is static block");
		b=a*5;
	}
	
	public static void main(String[] args)
	{
		StaticInt  obj1=new StaticInt();
		System.out.println(StaticInt.a+" "+StaticInt.b); //to acces StaticInt.a+" "+StaticInt.b static variables
		StaticInt.b+=3;  //op:4 20
		
		StaticInt  obj2=new StaticInt();
		System.out.println(StaticInt.a+" "+StaticInt.b);  //4 23
		
		
	}

}
