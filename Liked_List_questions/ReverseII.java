package Liked_List_questions;
public class ReverseII {
	
	private Node head;
	
	public  class Node
	{
		
		Node next;
		int val;
		public Node() {}
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
	public Node rev(Node head,int left,int right)
	{
		if(left==right)
		{
			return head;
		}
		
		//skip te first left-1 nodes
		Node curr=head;
		Node prev=null;
		for(int i=0;curr!=null&&i<left-1;i++)
		{
			prev=curr;
			curr=curr.next;
			
		}
		Node last=prev;
		Node newend=curr;
		
		Node next=curr.next;
		for(int i=0;curr!=null&&i<right-left+1;i++)
		{
			curr.next=prev;
			prev=curr;
			curr=next;
			if(next!=null)
			{
				next=next.next;
			}
		}
		
		if(last!=null)
		{
			last.next=prev;
		}else
		{
			head=prev;
		}
		
		newend.next=curr;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
