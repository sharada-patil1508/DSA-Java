package Liked_List_questions;


public class Rev_half_list {
	
	private class Node
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
	int size=0;
	public Rev_half_list()
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
		head=node;
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
	
	
	public void halfver(Node head)
	{
		Node mid=midnode(head);
		Node secondhead=reverselist(mid.next);
		mid.next=secondhead;
		
		if(head==null||head.next==null)
		{
			return;
		}
	
		
		
	}
	
	public Node reverselist(Node head)
	{
		Node prev=null,curr=head;
		while(curr!=null)
		{
			Node nextnode=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextnode;
		}
		
		return prev;
	}
	
	public Node midnode(Node head)
	{
		Node slow=head;
		Node fast=head.next;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	
	public static void main(String[] args) {
		
		Rev_half_list list=new Rev_half_list();
		list.insertatfirst(1);
		list.insertatfirst(2);
		list.insertatfirst(3);
		list.insertatfirst(2);
		list.insertatfirst(1);
	
		list.display();
		list.halfver(list.head);
		list.display();
		
		
				
	}

}
