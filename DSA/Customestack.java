package DSA;
import java.security.cert.CertStoreException;
import java.util.*;

public class Customestack {
    
    int data[];
    int size=10;
    public Customestack()
    {
    	this.size=size;
    	this.data=new int[size];
    }
    int ptr=-1;
    public boolean push(int ele) throws Exception
    {
    	if(isfull())
    	{
    		throw new Exception("stack is full");
    		
    	}
    	ptr++;
    	data[ptr]=ele;
    	return true;
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
    public void display()
    {
    	for(int i=0;i<=ptr;i++)
    	{
    		System.out.println(data[i]+" ");
    	}
    }
    
    public static void main(String[] args) throws Exception{
    	Customestack  stack=new Customestack();
    	stack.push(1);
    	stack.push(2);
    	stack.push(3);
    	stack.push(4);
    	stack.display();
    	System.out.println("poped ele is:"+stack.pop());
    	System.out.println("poped ele is:"+stack.pop());
    	
    	stack.display();
	}
}