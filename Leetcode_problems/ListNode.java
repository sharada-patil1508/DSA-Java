package Leetcode_problems;

public class ListNode {

    public class Node
    {
    	int val;
    	Node next;
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
   private  Node head;
   private  Node tail;
   private int size;
    public ListNode()
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
    public void insertatlast(int val)
    {
    	Node node=new Node(val);
    	if(tail==null)
    	{
    		insertatfirst(val);
    		return;
    	}
    	tail.next=node;
    	tail=node;
    	size++;
    	
    	
    }
    public void insertatpos(int val,int index)
    {
    	if(index==0)
    	{
    		insertatfirst(val);
    		return;
    	}
    	if(index==size)
    	{
    		insertatlast(val);
    	}
    	Node temp=head;
    	for(int i=1;i<index;i++)
    	{
    		temp=temp.next;
    	}
    	Node node=new Node(val,temp.next);
    	temp.next=node;
    	size++;
    }
    public int deletefirst()
    {
    	int val=head.val;
    	
    	if(head==null)
    	{
    		tail=null;
    		
    	}
    	head=head.next;
    	size--;
    	return val;
    }
    
    public int dleteatlast()
    {
    	if(size<=1)
    	{
    		return deletefirst();
    	}
    	Node sn=get(size-2);
    	int val=tail.val;
    	tail=sn;
    	tail.next=null;
    	size--;
    	return val;
    	
    	
    }
    public Node get(int index)
    {
    	Node temp=head;
    	for(int i=0;i<index;i++)
    	{
    		temp=temp.next;
    	}
    	return temp;
    }
   
    public void display()
    {
    	Node temp=head;
    	Node last=null;
    	while(temp!=null)
    	{
    		System.out.print(temp.val+"->");
    		temp=temp.next;
    	}
    	System.out.println("END");
    
    }
    public static void main(String[] args)
    {
    	ListNode list=new ListNode();
    	list.insertatfirst(5);
    	list.insertatfirst(4);
    	list.insertatfirst(3);
    	list.insertatfirst(2);
    	list.insertatfirst(1);
    	
    	list.display();
    	//list.insertatlast(11);
    	//list.display();
    	//list.insertatpos(100,1);
    	//list.display();
    	//System.out.println("deleted intem:"+list.deletefirst());
    	//list.display();
    	System.out.println("tail deleted"+list.dleteatlast());
    	list.display();
    	

    }
}
