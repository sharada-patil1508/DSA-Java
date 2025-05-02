package ExceptionsandThred;

public class main3 {

	public static void main(String[] args) throws Exception{
		int a=5;
		int b=0;
		divid(a,b);

	}
	static int  divid(int a,int b)
	{
		if(b==0)
		{
			throw new ArithmeticException("invalid ");
		}
		return a/b;
	}

	}


