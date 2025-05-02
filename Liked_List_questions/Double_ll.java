package Liked_List_questions;



public class Double_ll {
	private class Node
	{
		Node next;
		Node prev;
		int val;
		
		public Node(int val)
		{
			this.val=val;
		}
		
		public Node(int val,Node next,Node prev)
		{
			this.val=val;
			this.next=next;
			this.prev=prev;
		}
	}
	
	Node head;
	Node tail;
	int size=0;
	
	public Double_ll()
	{
		this.size=size;
	}
	
	public void insertatfirst(int val)
	{
		Node node=new Node(val);
		node.next=head;
		node.prev=null;
		if(head!=null)
		{
			head.prev=node;
			
		}else
		{
			tail=head=node;
		}
		head=node;
		size++;
	}
	
	public void insertatlsat(int val)
	{
		Node node=new Node(val);
		if(tail==null)
		{
			insertatfirst(val);
		}
		else
		{
			tail.next=node;
			node.next=null;
			node.prev=tail;
			tail=node;
		}
		tail=node;
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
	
	public void insertatpos(int val,int index)
	{
		if(index==0)
		{
			insertatfirst(val);
			return;
		}
		if(index==size)
		{
			insertatlsat(val);
			return;
		}
		
		Node temp=head;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		Node node=new Node(val,temp.next,temp.prev);
		temp.next=node;
		node.prev=temp;
		node.next=temp.next.next;
		size++;
	}
	
	public void deletatfirst()
	{
		if(head!=null)
		{
			Node curr=head;
			curr.prev=curr.next;
			head=curr.next;
		}else
		{
			System.out.println("list is empty");
		}
	}
	
	public void deleteatlast()
	{
		if(tail!=null)
		{
			Node curr=tail;
			curr.prev.next=null;
			tail=curr.prev;
		}else
		{
			System.out.println("list is empty");
		}
	}
	
	
	public static void main(String[] args) {
		Double_ll list=new Double_ll();
		list.insertatfirst(1);
		list.insertatfirst(2);
		list.insertatfirst(3);
		list.display();
		list.insertatlsat(9);
		list.insertatlsat(10);
		list.display();
		list.insertatpos(60,5);
		list.display();
		
				
	}
	

}
