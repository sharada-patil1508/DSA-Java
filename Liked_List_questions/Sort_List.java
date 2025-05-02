package Liked_List_questions;

//qstion contains
/*
 * 1.createing list
 * 2.insertion and display of ele to linked list
 * 3.dividing list
 * 4.finding mis of list
 * 5.soting the divided list
 * 6.then merg the sorted 2 list
 */

public class Sort_List {
	
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
	private Object first;
	private Object second;
	
	public Sort_List()
	{
		this.size=0;
	}
	
	public void inseratfirst(int val)
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
		System.out.print("null");
	}
	
	
	
	public Node sort(Node head)
	{
		if(head==null||head.next==null)
		{
			return head;
		}
		
		boolean swapped;
		do {
			swapped=false;
			
		
		Node temp=head;
		while(temp!=null&&temp.next!=null)
		{
			if(temp.val>temp.next.val)
			{
				int x=temp.val;
				temp.val=temp.next.val;
				temp.next.val=x;
				
				
				swapped=true;
			}
			temp=temp.next;
		}
		}while(swapped);
		
		return head;
	}
	
	
	
	public void dividlist(Node head)
	{
		if (head == null || head.next == null) {
	        System.out.println("List too small to divide.");
	        return;
	    }

	   
	    Node midval = mid(head);
	    System.out.println("Middle value: " + midval.val);

	    // Create two new lists
	    Sort_List l1 = new Sort_List();
	    Sort_List l2 = new Sort_List();

	    // Add nodes to the first list (from head to midval)
	    Node temp1 = head;
	    while (temp1 != midval) {
	        l1.inseratfirst(temp1.val);
	        temp1 = temp1.next;
	    }

	    // Add nodes to the second list (from midval to the end)
	    Node temp2 = midval;
	    while (temp2 != null) {
	        l2.inseratfirst(temp2.val);
	        temp2 = temp2.next;
	    }
	    
	    l1.display();
	    System.out.println();
	    l2.display();

	   System.out.println();
	   System.out.println("soretd list");
	    
	    Node hf=l1.head;
	    l1.head=l1.sort(hf);
	    Node hs=l2.head;
	    l2.head=l2.sort(hs);
	    
	    l1.display();
	    System.out.println();
	    l2.display();  
	    
	   
	    Sort_List ans= Sort_List.merglist(l1,l2);
	    System.out.println();
		 ans.display();
		
	}
	
	public  static Sort_List merglist(Sort_List  first, Sort_List second)
	{
	
		Node h1=first.head;
		Node h2=second.head;
		Sort_List ans=new Sort_List();
		
		while(h1!=null&&h2!=null)
		{
			if(h1.val<h2.val)
			{
				ans.inseratfirst(h1.val);
				h1=h1.next;
			}else
			{
				ans.inseratfirst(h2.val);
				h2=h2.next;
			}
		}
		if(h1!=null)
		{
			ans.inseratfirst(h1.val);
			h1=h1.next;
		}
		if(h2!=null)
		{
			ans.inseratfirst(h2.val);
			h2=h2.next;
		}
		
		return ans;
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
		
		Sort_List list=new Sort_List();
		list.inseratfirst(15);
		list.inseratfirst(8);
		list.inseratfirst(60);
		list.inseratfirst(1);
		list.inseratfirst(10);
		list.inseratfirst(13);
		list.inseratfirst(9);
		list.inseratfirst(6);
		list.display();
		/*list.head=list.sort(list.head);*/
		System.out.println();
		list.dividlist(list.head);
		//list.display();
		
		
		
		
	}

}
