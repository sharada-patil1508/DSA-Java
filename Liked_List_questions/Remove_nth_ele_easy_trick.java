package Liked_List_questions;


public class Remove_nth_ele_easy_trick {
	
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
	
	Remove_nth_ele_easy_trick()
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
	
	public void remove(int index)
	{
		int val=find(index);
		//System.out.println(val);
		Node jb=head;
		for(int i=1;i<index;i++)
		{
			jb=jb.next;
		}
		
	
		Node temp=head;
		
		while(temp!=null)
		{
			if(val==temp.val)
			{
				jb.next=temp.next;
				size--;
			}
			temp=temp.next;
		}
		
	}
	
	public int find(int index)
	{
		Node temp=head;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp.val;
		
	}
	
	public void reorder(Node head)
	{
		Node midval=mid(head);
		
		Node hs=reverse(midval.next);
		
		midval.next=null;
		
		Node hf=head;
		while(hf!=null&&hs!=null)
		{
			Node temp1=hf.next;
			Node temp2=hs.next;
			
			hf.next=hs;
			hs.next=temp1;
			
			hf=temp1;
			hs=temp2;
		}
		
		
	}
	
	public Node reverse(Node head)
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
	
	public Node mid(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	
	public static void main(String[] args) {
		Remove_nth_ele_easy_trick list=new Remove_nth_ele_easy_trick();
		list.insertatfirst(1);
		list.insertatfirst(2);
		list.insertatfirst(3);
		list.insertatfirst(4);
		list.insertatfirst(5);
		list.display();
	list.reorder(list.head);
		list.display();
		
		
		
	}

}
