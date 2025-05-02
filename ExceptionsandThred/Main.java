package ExceptionsandThred;

public class Main {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		try {
		    divid(a, b);
		} catch (ArithmeticException e) {
		    System.out.println(e.getMessage());
		} 
		//this block will execute when above exceptios are unable to excecute.
		catch (Exception e) {
		    System.out.println("normal exception " + e.getMessage());
		} finally {
		    System.out.println("this will always execute");
		}

	}
	static int  divid(int a,int b)
	{
		return a/b;
	}

}
