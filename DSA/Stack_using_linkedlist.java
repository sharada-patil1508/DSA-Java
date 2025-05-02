package DSA;

public class Stack_using_linkedlist {
	
	private Node head;
	
	private Node tail;
	int size;
	public Stack_using_linkedlist()
	{
		this.size=size;
	}
	public class Node
	{  
		int val;
		Node next;
		public Node(int val)
		{
			this.val=val;
		}
	}

	public void push(int val)
	{
		Node node=new Node(val);
		if(tail==null)
		{
			head.next=node;
			size++;
		}else
		{
			tail.next=node;
			tail=node;
			tail.next=null;
			size++;
		}
				
		
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.val);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		 Stack_using_linkedlist list=new  Stack_using_linkedlist();
		 list.push(5);
		 list.push(19);
		 list.display();
		 
		

	}

}
