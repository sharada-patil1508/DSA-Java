package Stack;
import java.util.*;
public class Dynamic_stack {


		int[] data;
		int size=5;
		int ptr=-1;
		public Dynamic_stack()
		{
			this.size=size;
			this.data=new int[size];
			
		}
		 public void dynamicstack() {
		        int[] newData = new int[data.length * 2];
		        for (int i = 0; i < data.length; i++) {
		            newData[i] = data[i];
		        }
		        data = newData;
		    }
		
		public  void push(int x) throws Exception {
			if(isfull())
			{
				dynamicstack();
			}
			ptr++;
			data[ptr]=x;
			
		}
		public boolean isfull()
		{
			return ptr==data.length-1;
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
			return data[ptr--];
			
		}
		
		public void display() throws Exception
		{
			if(isempty())
			{
				throw new Exception("stack is empty");
			}
			for(int i=ptr;i>=0;i--)
			{
				System.out.println(data[i]);
			}
		}
		public static void main(String[] args) throws Exception {
			
			Dynamic_stack stack=new Dynamic_stack();
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(6);
	//System.out.println(stack.pop());
		//System.out.println(stack.pop());
		System.out.println();
			stack.display();
			
		}
		
	}




