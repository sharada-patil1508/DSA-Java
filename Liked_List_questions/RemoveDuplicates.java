package Liked_List_questions;
import java.util.*;

import Liked_List_questions.QusetionsOnLL.Node;
public class RemoveDuplicates {
	private Node head;
	private Node tail;
	int val;
	int size;
	public RemoveDuplicates()
	{
		this.size=0;
	}
	
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
		node.next=head;
		head=node;
		if(head==null)//tail
		{
			head=tail;
		}
	}
	
	public void remove()
	{
		Node node=head;
		while(node.next!=null)
		{
			if(node.val==node.next.val)
			{
				node.next=node.next.next;
				size--;
				
			}else {
			node=node.next;
			}
		}
		tail=node;
		tail.next=null;
		
	}
	
	//if tail and size is not given
	
	/*public void removeDup() {
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
*/
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

	public static void main(String[] args) {
		RemoveDuplicates  list=new RemoveDuplicates();
		
		//user input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ele to list:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int val=sc.nextInt();
			list.insert(val);;
		}
		/*list.insert(1);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(4);
		list.display();*/
		 list.remove();
		 list.display();
		
		
		
	}

}
