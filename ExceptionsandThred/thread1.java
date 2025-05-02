package ExceptionsandThred;

public class thread1 extends Thread{
	public static void main(String[] args)
	{
		thread1 th=new thread1();
		th.start();
		
	}
	public void run()
	{
		System.out.println("i am in thread");
	}
	
}
