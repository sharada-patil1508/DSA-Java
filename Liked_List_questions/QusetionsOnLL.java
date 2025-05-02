package Liked_List_questions;

import Liked_List_questions.RotateLL.Node;

public class QusetionsOnLL {
	
		/*LINKED LIST
	1.sngle liked ist
	2.double linked list
	3.circular linked list
	
	QESTIONS
	1.mid of LL
	2.reverese SLL,DLL
	3.Rotate LL
	4.operation related to the end of linked list (i.Nth node from end of linked list)
	5.Deletion SLL DLL CLL
	6.Remove duplicate from sorted and unsorted LL
	7.Detect loop/Cycle in LL
	8.merging of two LL
	9.Implement Queue using LL
	10.Implement stack using LL
	11.Remove every kth node from LL
	12.Swaping based on the condition
	13.Check Palindrome
	14.*/

	private Node  head;
	
	public class Node
	{
		int val;
		Node next;
		public Node()
		{
			
		}
		public Node(int val,Node next)
		{
			this.val=val;
			this.next=next;
		}
		public Node(int val)
		{
			this.val=val;
		}
		
		
	}
	
	public void insertfirst(int val)
	{
		Node node=new Node(val);
		if(head==null)
		{
		
			head=node;
		}
		
		else
		{
			node.next=head;
			head=node;
		}
		
	}
	public void insertatlast(int val)
	{
		Node node=new Node(val);
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		if(last==null)
		{
			insertfirst(val);
		}else
		{
			last.next=node;
			last=node;
		}
	}
	public int deleteatfirst()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		int val=head.val;
		if(head.next==null)
		{
			head=null;
		}
		else
		{
			
			head=head.next;
			
		}
		return val;
	}
	
	public int deleteatlast()
	{
		Node lastnext=head;
		int val=0;
		while(lastnext.next.next!=null)
		{
			lastnext=lastnext.next;
		}
		if(head==null)
		{
			System.out.println("list is empty");
			return -1;
		}
		if(head.next==null)
		{
			val=head.val;
			head=null;
			return val;
		}
		else
		{
			 val=lastnext.next.val;
			
			lastnext.next=null;
			
		}
		return val;
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
	
	public void remove(Node node)
	{
		if(head==null)
		{
			System.out.println("empty list");
			return;
		}
		if(head.val==node.val)
		{
			head=head.next;
			return;
		}
		Node temp=head;
		int count=0;
		while(temp!=null&&temp.next!=null)
		{
			if(temp.next.val==node.val)
			{
				temp.next=node.next;
				break;
			}
			temp=temp.next;
			
		}
		
		
	}
	
	public void removeDup() {
	    if (head == null) {
	        System.out.println("Empty list");
	        return;
	    }

	    Node current = head;

	    while (current != null) {
	        Node runner = current;

	        // Remove all duplicates of the current node
	        while (runner.next != null) {
	            if (runner.next.val == current.val) {
	                runner.next = runner.next.next;  // Skip the duplicate node
	            } else {
	                runner = runner.next;  // Move to the next node if not a duplicate
	            }
	        }

	        // Move to the next node
	        current = current.next;
	    }
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
	public Node reverse(Node head)
	{
		Node prev=null,cur=head;
		while(cur!=null)
		{
			Node nextnode=cur.next;
			cur.next=prev;
			prev=cur;
			cur=nextnode;
		}
		return prev;
	}
	
	public boolean palindrome(Node head)
	{
		Node midnode=mid(head);
		Node rev=reverse(midnode);
		Node revhead=rev;
		
		while(head!=null&&revhead!=null)
		{
			if(head.val!=revhead.val)
			{
				break;
			}
			head=head.next;
			revhead=revhead.next;
		}
		//list to original state
		reverse(revhead);
		
		return head==null||head.next==null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 QusetionsOnLL  list=new  QusetionsOnLL();
		 list.insertfirst(1);
		 list.insertfirst(4);
		 list.insertfirst(3);
		 list.insertfirst(4);
		 list.insertfirst(5);
		 list.display();
		//Node midd=list.mid();
		//System.out.println(midd.val);
		boolean x=list.palindrome(list.head);
		System.out.println(x);
		 list.display();

	}

}
