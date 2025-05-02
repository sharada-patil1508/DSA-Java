package OOP;

public class Car implements Engine,Break{

	@Override
	public void start() {
		System.out.println("i am inside car start");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("i am inside car stop");
	}
	
	public void Break()
	{
		System.out.println("i am inside car break");
	}
	
}
