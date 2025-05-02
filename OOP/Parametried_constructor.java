package OOP;

public class Parametried_constructor {
	
	String str;
	int num;
	int n;
	
	//constructor oveloding
	
	Parametried_constructor(String name,int id)
	{
		this.str=name;
		this.num=id;
		
	}
	
	Parametried_constructor(int n)
	{
		this.n=n;
		System.out.println(n*n);
	}
	
	
	//copy constructor
	Parametried_constructor(Parametried_constructor o3)
	{
	  this.str=o3.str;
	  this.num=o3.num;
	  
	  
	}

	public static void main(String[] args) {
		
		Parametried_constructor o=new Parametried_constructor("sharada",3);
		System.out.println(o.str+" "+o.num);
		Parametried_constructor o1=new Parametried_constructor(8);
		
		Parametried_constructor o3=new Parametried_constructor(o);
		
		System.out.println(o3.str+" "+o3.num);

	}

}
