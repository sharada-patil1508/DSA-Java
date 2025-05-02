package Liked_List_questions;

public class Reverse_LL {
	private ListNode head;
	public class ListNode
	{
		int val;
		ListNode next;
		
		public ListNode()
		{
			
		}
	public	ListNode(int val)
		{
			this.val=val;
		}
	public ListNode(int val ,ListNode next)
	{
		this.val=val;
		this.next=next;
	}
	
	}
	
	public void insertatfirst(int val)
	{
		ListNode node=new ListNode(val);
		if(head==null)
		{
			head=node;
		}else
		{
		node.next=head;
		head=node;
		}
	}
	
	public void display()
	{
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println("END");
	}
	public ListNode reverse(ListNode head)
	{
		ListNode prev=null,cur=head;
		while(cur!=null)
		{
			ListNode nextnode=cur.next; // Store the next node
			cur.next=prev;  // Reverse the link
			prev=cur;       // Move prev to current node
			cur=nextnode;  // Move cur to next node (nextnode)
			
			
		}
		return prev; // New head of the reversed list
		
	}

	public static void main(String[] args) {
		
		Reverse_LL  list=new Reverse_LL();
		list.insertatfirst(5);
		list.insertatfirst(4);
		list.insertatfirst(3);
		list.insertatfirst(2);
		list.insertatfirst(1);
		list.display();
		list.head = list.reverse(list.head);
		list.display();
		System.out.println(list.head.val);
		
	}

}
