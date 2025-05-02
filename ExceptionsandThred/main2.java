package ExceptionsandThred;
//custome exception implementation
public class main2 {

	public static void main(String[] args) {
		try
		{
			String name="sharadapatil";
			if(name.equals("sharada")){
				throw new Myexception("the name is sharada");
				
				}else
				{
					System.out.println("the name is not sharada");
				}
					
		}	catch(Myexception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
//Custom Exception Class
class Myexception extends Exception
{
	public Myexception(String name)
	{
		super(name);
	}
}
