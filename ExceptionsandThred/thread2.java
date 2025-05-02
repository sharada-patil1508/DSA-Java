package ExceptionsandThred;

public class thread2 implements Runnable{

	 public static void main(String[] args) {
	        thread2 runnableInstance = new thread2(); // Create an instance of Thread2
	        Thread thread = new Thread(runnableInstance); // Pass it to a Thread
	        thread.start(); // Start the thread
	    }


	@Override
	public void run() {
		System.out.println("i am inside run runnable");
		
	}

}
