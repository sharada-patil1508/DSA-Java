package DSA;

public class DoubleLL { 
	public class Node
	{
		int val;
		Node prev;
		Node next;
	
		public Node() {}
		public Node(int val)
		{
			this.val=val;
		}
		public Node(int val,Node next)
		{
			this.next=next;
			this.val=val;
		}
	}
		Node head;
		
		public  void insertatfirst(int val)
		{
			Node node=new Node(val);
			if(head==null)
			{
				head=node;
				node.next=null;
				node.prev=null;
			}else {
			
			head.prev=node;
			node.next=head;
			head=node;
			node.prev=null;
			}
		}
		
		public void insertatlast(int val)
		{
			Node node=new Node(val);
			if(head==null)
			{
				node.next=null;
				head=node;
				node.prev=null;
			}
			Node last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=node;
			node.prev=last;
			last=node;
		}
		
		public void insertAtpos(int val, int index) {
		    Node node = new Node(val);

		    // Case 1: Insert at the head (index 0)
		    if (index == 0) {
		        if (head != null) {
		            node.next = head;
		            head.prev = node;
		        }
		        head = node;
		        return;
		    }

		    Node temp = head;
		    int count = 0;

		    // Traverse to the node just before the index
		    while (temp != null && count < index - 1) {
		        temp = temp.next;
		        count++;
		    }

		    // Case 2: If index is beyond the last node, insert at the end
		    if (temp == null || temp.next == null) {
		        insertatlast(val);
		        return;
		    }

		    // Case 3: Insert at the middle
		    Node nextNode = temp.next;
		    temp.next = node;
		    node.prev = temp;
		    node.next = nextNode;
		    if (nextNode != null) {
		        nextNode.prev = node;
		    }
		}

		public Node get(int index)
		{
			Node temp=head;
			for(int i=0;i<index&&temp!=null;i++)
			{
				temp=temp.next;
			}
			return temp;
		}
		
		public int deleteatfirst()
		{
			if(head==null)
			{
				System.out.println("list is empty");
			}
			int val=head.val;
			// If there is only one node in the list
			if(head.next==null)
			{
				head=null;
				
			}else {
				head=head.next;
				head.prev=null;
			}
			return val;	
		}
		public int deleteatlast()
		{
			
			
			if(head.next==null)
			{
				int val=head.val;
				head=null;
				return val;
			}
			
			Node temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			int val=temp.next.val;
			temp.next=null;
			
			return val;
			
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
	


	public static void main(String[] args) {
		
		DoubleLL  list=new DoubleLL();
		list.insertatfirst(9);
		 list.insertatfirst(8);
		 list.insertatfirst(7);
		 list.insertatfirst(6);
		 list.display();
		 System.out.println(list.deleteatlast());
		 list.display();
	
		
		
		 
	}

}
