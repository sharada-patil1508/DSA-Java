package Stack;
import java.util.*;
public class two_stack_operation {

	int s1[];
	int s2[];
	int size=5;
	int ptr=-1;
	int ptr2=-1;
	public  two_stack_operation()
	{
		
		this.s1=new int[size];
		this.s2=new int[size];
		
	}
	public void push(int x) throws Exception
	{
		if(isfull())
		{
			throw new Exception("stack is full");
		}
		ptr++;
		s1[ptr]=x;
		
	}
	public boolean isfull()
	{
		return ptr==s1.length-1;
	}
	public boolean isempty()
	{
		return ptr==-1;
	}
	public int pop() throws Exception
	{
		if(isempty())
		{
			throw new Exception("stack is empty");
		}
		return s1[ptr--];
	}
	public void display()throws Exception
	{
		if(isempty())
		{
			throw new Exception("stack is empty");
		}
		for(int i=ptr;i>=0;i--)
		{
			System.out.println(s1[i]);
		}
		
	}
	public void stack2()
	{
		 // Transfer elements from s1 to s2
        for (int i = ptr; i >= 0; i--) {
            s2[++ptr2] = s1[i];
        }

        // Display s2
        System.out.println("Elements in s2 (top to bottom):");
        for (int i = ptr2; i >= 0; i--) {
            System.out.println(s2[i]);
        }
		
	}
	
	
	public static void main(String[] args) throws Exception {
		two_stack_operation  stack=new two_stack_operation();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.stack2();
		stack.display();
	}

}
