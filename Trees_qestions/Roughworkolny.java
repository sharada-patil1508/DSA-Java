package Trees_qestions;
import java.util.*;
public class Roughworkolny {
	int[] data;
	int size=10;
	int ptr=-1;
	public Roughworkolny()
	{
		this.size=size;
		this.data=new int[size];
	}
	
	public void push(int ele) throws Exception
	{
		if(isFull())
		{
			throw new Exception("stack is full");
		}
		ptr++;
		data[ptr]=ele;
	}
	public int pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("stack is empty");
		}
	
		return data[ptr];
	
		
	}
	public boolean isFull()
	{
		return ptr==size-1;
	}
	public boolean isEmpty()
	{
		return ptr==-1||ptr<size-1;
	}
	
	public void display()
	{
		for(int i=ptr;i>=0;i--)
		{
			System.out.println(data[i]+" ");
		}
	}

	public static void main(String[] args) throws Exception
	{
		Roughworkolny stack=new Roughworkolny();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.display();
		System.out.println("poped ele is"+stack.pop());
		//stack.display();
		}
}
