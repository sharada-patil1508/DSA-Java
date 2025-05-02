package OOP;

public class Get_and_Set_Methods {
	
	 static String str;
	 static int num;
	
	public static void setval(String s,int a)
	{
		str=s;
		num=a;
	}
	
	public static void getfun()
	{
		System.out.println("name is:"+str+"  number is:"+num);
	}

	public static void main(String[] args) {
		Get_and_Set_Methods.setval("sharada",1);
		Get_and_Set_Methods.getfun();
		
	}

}
