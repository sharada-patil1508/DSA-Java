package Liked_List_questions;

public class RotateLL {
	
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
		
		public void insertatfirst(int val)
		{
			Node node=new Node(val);
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
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.val+"->");
				temp=temp.next;
			}
			System.out.println("END");
		}
		
		public Node rotateRight(Node head,int k)
		{
			if(k<=0||head==null||head.next==null)
			{
				return head;
			}
			
			Node last=head;
			int length=1;
			while(last.next!=null)
			{
				last=last.next;
				length++;
			}
			
			last.next=head;// Make the list circular
			int rotations=k%length;
			int skip=length-rotations;
			Node newlast=head;
			for(int i=0;i<skip-1;i++)
			{
				newlast=newlast.next;
				
			}
			head=newlast.next;
			newlast.next=null;
			return head;
		}

	public static void main(String[] args) {
		RotateLL list=new RotateLL();
		list.insertatfirst(1);
		list.insertatfirst(2);
		list.insertatfirst(3);
		list.insertatfirst(4);
		list.insertatfirst(5);
		list.insertatfirst(100);
		list.insertatfirst(200);
		list.display();
	list.head=list.rotateRight(list.head,3);
		list.display();
		
	}

}
