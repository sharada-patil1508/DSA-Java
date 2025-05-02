package OOP;

 class  Method  {
	
	static int id;
	static String str;
	
	public static void fun()
	{
		System.out.println(str);
		System.out.println(id);
	}



	public static void main(String[] args) {
		
		 Method  o=new  Method ();
		o.id=2;
		o.str="sharada";
		o.fun();
		

	}

}
