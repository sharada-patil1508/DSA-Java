package Liked_List_questions;

public class ReorderLL {

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
			
			public void reorderlist(Node head) {
		        if (head == null || head.next == null) {
		            return;
		        }

		        // Step 1: Find the middle of the list
		        Node mid = midnode(head);

		        // Step 2: Reverse the second half of the list
		        Node headSecond = reverselist(mid.next);

		        // Disconnect the first half from the second half
		        mid.next = null;

		        // Step 3: Merge the two halves
		        Node headFirst = head;
		        while (headFirst != null && headSecond != null) {
		            Node temp1 = headFirst.next;
		            Node temp2 = headSecond.next;

		            headFirst.next = headSecond;
		            headSecond.next = temp1;

		            headFirst = temp1;
		            headSecond = temp2;
		        }
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
		    }


			public static void main(String[] args) {
				
				
				ReorderLL  list=new ReorderLL();
				list.insertatfirst(1);
				list.insertatfirst(2);
				list.insertatfirst(3);
				list.insertatfirst(4);
				list.insertatfirst(5);
				list.display();
			list.reorderlist(list.head) ;
			list.display();
				


	}

}
