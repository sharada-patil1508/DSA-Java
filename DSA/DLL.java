package DSA;

public class DLL {
	Node head;
	Node tail;
public  class Node
	{
		int val;
		Node next;
		Node prev;
		
		private Node(int val)
		{
			this.val=val;
		}
		private Node(int val,Node next,Node prev)
		{
			this.val=val;
			this.next=next;
			this.prev=prev;
		}
	
		
		
	}
public Node find(int val)
{
	Node temp=head;
	while(temp.next!=null)
	{
		if(temp.val==val)
		{
			return temp;
		}
		temp=temp.next;
		
	}
	return null;
	
}
public void insertatafternode(int after,int val)
{
	Node p=find(after);
	if(p==null)
	{
		System.out.println("does not exist");
		return;
	}
	Node node=new Node(val);
	node.next=p.next;
	p.next=node;
	node.prev=p;
	if(node.next!=null)
	{
		node.next.prev=node;
	}
}
	public void insertatfirst(int val)
	{
		Node node=new Node(val);
		node.next=head;
		node.prev=null;
		if(head!=null)
		{
			head.prev=node;
		}else
		{
			tail=node;
		}
		head=node;
		
	}
	public void insertatlast(int val)
	{
		Node node=new Node(val);
		if(tail==null)
		{
			insertatfirst(val);
		}
		tail.next=node;
		node.prev=tail;
		node.next=null;
		tail=node;
		
		
	}
	public void inwithoutail(int val)
	{
		Node node=new Node(val);
		Node last=head;
		node.next=null;
		if(head==null)
		{
			node.prev=null;
			head=null;
			return;
			
		}
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=node;
		node.prev=last;
		
	}
	public void display()
	{
		Node temp=head;
		Node last=null;
		while(temp!=null)
		{
			System.out.print(temp.val+"->");
			last=temp;
			temp=temp.next;
		}
		System.out.println("end");
		
		System.out.println("print in reverse order");
		{
			while(last!=null)
			{
				System.out.print(last.val+"->");
				last=last.prev;
			}
			System.out.println("null");
		}
		
	}
	public static void main(String[] args)
	{
		DLL list=new DLL();
		list.insertatfirst(8);
		list.insertatfirst(9);
		list.insertatfirst(10);
		list.insertatfirst(12);
		list.insertatlast(11);
		list.display();
		list.insertatfirst(20);
		list.insertatlast(30);
		list.inwithoutail(100);
		list.inwithoutail(200);
		list.insertatafternode(20,111);
		list.display();
	}

}
