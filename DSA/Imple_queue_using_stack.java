package DSA;
import java.util.*;

//insert efficint o(1)
//remove not efficient o(n)

public class Imple_queue_using_stack {
	public void main(String[] args)
	{
		
	}
}
class Questack
{
	private Stack<Integer> first;
	private Stack<Integer> second;
	public Questack()
	{
		first=new Stack<>();
		second=new Stack<>();
	}
	
	public void add(int item)
	{
		first.push(item);
	}
	
	public int remove() throws Exception
	{
		while(!first.isEmpty())
		{
			int popped=first.pop();
			second.push(popped);  //or second.push(first.pop();
			
		}
		int removed=second.pop();
		
		while(!second.isEmpty())
		{
			first.push(second.pop());
		}
		return removed;
	}
	
	
	//just we are looking at the item not removeing the item
	public int  peek() throws Exception
	{
		while(!first.isEmpty())
		{
			int popped=first.pop();
			second.push(popped);  //or second.push(first.pop();
			
		}
		int peeked=second.peek();
		
		while(!second.isEmpty())
		{
			first.push(second.pop());
		}
		return peeked;
			
	}
	
	public boolean isEmpty()
	{
		return first.isEmpty();//if first is empty the queue is also empty
	}
	
	
}

