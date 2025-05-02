package Liked_List_questions;

public class RmoveNthnode {
	public Node head;
	public int size;
	public class Node
	{
		int val;
		Node next;
		public Node()
		{
			
		}
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
	
	public void insert(int val)
	{
		Node node=new Node(val);
		if(head==null)
		{
			head=node;
		}
		else {
		node.next=head;
		head=node;
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
		System.out.println("END");
	}
	public Node remove(Node head,int n)
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		
		temp=head;
		if(count==1)
		{
			return null;
		}
		
		if(count==n)
		{
			head=head.next;
			return head;
		}
		
		int size=count-n;
		for(int i=1;i<size;i++)
		{
			temp=temp.next;
		}
		
		temp.next=temp.next.next;
		return head;
	}

	public static void main(String[] args) {
		
		RmoveNthnode  list=new RmoveNthnode();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.display();
		list.head=list. remove(list.head,1);
		list.display();
	}

}
