package DSA;

import java.util.Stack;

public class Queue_stack_remove_efficint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class removeeff
{
	private Stack<Integer> first;
	private Stack<Integer> second;
	public removeeff()
	{
		first=new Stack<>();
		second=new Stack<>();
	}
	
	public void add(int item) throws Exception
	{
		while(!first.isEmpty())
		{
			second.push(first.pop());
			
		}
		first.push(item);
		while(!second.isEmpty())
		{
			first.push(second.pop());
		}
	}
	
	public int remove() throws Exception
	{
		return first.pop();
	}
	
	
	//just we are looking at the item not removeing the item
	public int  peek() throws Exception
	{
		return first.peek();
			
	}
	
	public boolean isEmpty()
	{
		return first.isEmpty();//if first is empty the queue is also empty
	}
	
	
}

