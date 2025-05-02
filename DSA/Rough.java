package DSA;
import java.util.*;

 class Rough {
	
	public class Node
	{
		Node next;
		int val;
		
		public Node(int val)
		{
			this.val=val;
		}
		
		public Node(int val,Node next)
		{
			this.val=val;
			this.next=next;
		}
	}
	
	Node head;
	Node tail;
	int size;
	
	Rough()
	{
		this.size=0;
	}
	
	public void insertatfirst(int val)
	{
		Node node=new Node(val);
		node.next=head;
		head=node;
		if(tail==null)
		{
			tail=head;
		}
		size++;
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println("end");
	}
	
	public Node reverse(Node head,Node left,Node right)
	{
		if(head==null)
		{
			return null;
		}
		
		Node prev=null,curr=left.next,nextnode=null;
		while(curr!=right)
		{
			
			 nextnode=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextnode;
			
			
		}
		return prev;
	}
	
	
	public static void main(String[] args) {
		Rough list=new Rough();
		list.insertatfirst(5);
		list.insertatfirst(4);
		list.insertatfirst(3);
		list.insertatfirst(2);
		list.insertatfirst(1);
		list.display();
		list.head= list.reverse(list.head,list.head.next,list.head.next.next.next);
		list.display();
		
	}
}

