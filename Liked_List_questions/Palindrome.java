package Liked_List_questions;

import Liked_List_questions.QusetionsOnLL.Node;

public class Palindrome {
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
	
	public boolean isPalindrome(Node head)
	{
		Node mid=midnode(head);
		Node headSecond=reverselist(mid);
		Node reversehead=headSecond;
		
		//comapre both halves
		while(head!=null&&headSecond!=null)
		{
			if(head.val!=headSecond.val)
			{
				break;
			}
			
			head=head.next;
			headSecond=headSecond.next;
		}
		
		  // Restore the list by reversing the second half back to its original form.
			reverselist(reversehead);
		
		return head==null||headSecond==null;
	}
	
	public Node reverselist(Node head)
	{
		Node prev=null,cur=head;
		while(cur!=null)
		{
			Node nextnode=cur.next;
			cur.next=prev;
			prev=cur;
			cur=nextnode;
			
			
		}
		return prev;
		
	}
	
	public Node midnode(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
        //in main class
        /*Node midd=list.mid();
		System.out.println(midd.val);*/
    }
	
	


	public static void main(String[] args) {
		
		Palindrome list=new Palindrome();
		list.insertatfirst(1);
		list.insertatfirst(2);
		list.insertatfirst(3);
		list.insertatfirst(2);
		list.insertatfirst(1);
		list.display();
		boolean  x=list.isPalindrome(list.head);
		System.out.println("is palindrom:"+x);
		list.display();
		  

	}

}



/*
class Solution {
    public boolean isPalindrome(ListNode head) {
         List<Integer> list=new ArrayList();
         while(head!=null)
         {
            list.add(head.val);
            head=head.next;
         }

         int left=0;
         int right=list.size()-1;
         while(left<right&&list.get(left)==list.get(right))
         {
            left++;
            right--;
         }
         return left>=right;
    }
}*/