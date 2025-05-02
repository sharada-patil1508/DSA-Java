package Liked_List_questions;

public class Find_lengh_of_LL_and_search_ele {
	
	private class Node
	{
		Node next;
		int val;
		
		public Node(int val)
		{
			this.val=val;
		} 
	}
	int size;
	public Node head;
	Node tail;
	
	public Find_lengh_of_LL_and_search_ele()
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
			tail=node;
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
	
	public void length()
	{
		Node node=head;
		int count=0;
		while(node!=null)
		{
			count++;
			node=node.next;
		}
		System.out.println(count);
	}
	
	public static  boolean search(int val,Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(val==temp.val)
			{
				return true;
				
			}else
			{
				temp=temp.next;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		 Find_lengh_of_LL_and_search_ele list=new  Find_lengh_of_LL_and_search_ele();
		 list.insertatfirst(1);
		 list.insertatfirst(2);
		 list.insertatfirst(3);
		 list.insertatfirst(4);
		 list.insertatfirst(5);
		 list.display();
		 boolean ans=search(99,list.head);
		 if(ans)
		 {
			 System.out.println("ele found");
		 }else
		 {
			 System.out.println("ele not found");
		 }
		 
		 
	}

}
