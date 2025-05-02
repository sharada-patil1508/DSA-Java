package DSA;

public class cuctstackmain {

	public static void main(String[] args) throws Exception {
		Customestack stack=new Customestack();
		stack.push(9);
		stack.push(2);
		stack.push(5);
		System.out.println(stack.pop());
		stack.display();
		
	}

}
