package Liked_List_questions;
import java.util.*;
public class MergsoretdLL {
	private Node head;
	private Node tail;
	private int size;
	int value;
	public class Node
	{
		private int value;
		private Node next;
		
		public Node(int value)
		{
			this.value=value;
		}
		
		public Node(int value,Node next)
		{
			this.value=value;;
			this.next=next;
		}
	}
	
	public void insertatfirst(int val)
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
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+"->");
			temp=temp.next;
		}
		System.out.println("END");
	}

	public static  MergsoretdLL merg(MergsoretdLL first,MergsoretdLL second)
	{
		Node f=first.head;
		Node s=second.head;
		MergsoretdLL ans=new MergsoretdLL();
		while(f!=null&&s!=null)
		{
			if(f.value>s.value)
			{
				ans.insertatlast(f.value);
				f=f.next;
			}else
			{
				ans.insertatlast(s.value);
				s=s.next;
			}
		}
		
		while(f!=null)
		{
			ans.insertatlast(f.value);
			f=f.next;
		}
		while(s!=null)
		{
			ans.insertatlast(s.value);
			s=s.next;
		}
		return ans;
	}
	
	public static void main(String[] args)
	{
		MergsoretdLL l1=new MergsoretdLL();
		MergsoretdLL l2=new MergsoretdLL();
		 System.out.println("enter ele to the list1:");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 int a=sc.nextInt();
			 l1.insertatfirst(a);
		 }
		 System.out.println("enter ele to the list2:");
		 int m=sc.nextInt();
		 for(int i=0;i<m;i++)
		 {
			 int a=sc.nextInt();
			 l2.insertatfirst(a);
		 }
		 
		 l1.display();
		 l2.display();
		 
		 MergsoretdLL ans= MergsoretdLL.merg(l1,l2);
		 ans.display();
		 sc.close();
		 
		 
		 
		 
		
		
	}

}
