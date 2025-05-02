 package Liked_List_questions;

public class BubblesortLL {
	int size=0;
	BubblesortLL()
	{
		this.size=size;
	}
	Node head;
	Node tail;
	public class Node
	{
		int val;
		
		Node next;
		
		public Node() {}
		public Node(int val)
	{
			this.val=val;
	}
	}
	public void bubblesort()
	{
		//bubbleSort(size-1,0);
	}
	/*public void bubbleSort(int row,int col)
	{
		if(row==0)
		{
			return;
		}
		if(col<row)
		{
			Node first=get(col);
			Node second=get(col+1);
			
			if(first.val>second.val)
			{
				 if(first==head)
				 {
					 head=second;
					 first.next=second.next;
					 second.next=first;
					 
				 }else if(second==tail)
				 {
					 Node prev=get(col-1);
					 prev.next=second;
					 tail=first;
					 first.next=null;
					 second.next=tail;
				 }
				 else
				 {
					 Node prev=get(col-1);
					 prev.next=second;
					 first.next=second.next;
					 second.next=first;
				 }
			}
			
			bubbleSort(row,col+1);	
		}else
		{
			bubbleSort(row-1,0);
		}
	}*/
	public Node get(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


	public static void main(String[] args) {
		
	}

}
