package DSA;

import java.util.*;

public class Linkedlist {
	private Node head;
	Node tail;
	private int size;
	
	private class Node
	{
		
		//2 attributes of class Rough
		//to store int val
		private int value;
		
		//instance of class
		private Node next;
		
		public Node(int value)
		{
			this.value=value;
		}
		
		public Node(int value,Node next)
		{
			this.value=value;
			this.next=next;
		}
	}
	
	//Sets the size of the linked list to 0, indicating that the list is empty when it is first created.
	public Linkedlist()
	{
		this.size=0;
	}
	public void insertatfirst( int val) {
	    Node node = new Node(val);  // Step 1: Create a new node with the given value
	    node.next = head;          // Step 2: Point the new node's `next` to the current head
	    head = node;               // Step 3: Update `head` to point to the new node
	    if (tail == null) {        // Step 4: If the list was empty (tail is null), set `tail` to the new head
	        tail = head;
	    }
	    size++;                    // Step 5: Increment the size of the list
	}

	
	public void insertatlast(int val)
	{
		Node node=new Node(val);
		if(tail==null)		
		{
			insertatfirst(val);
		}
		tail.next=node;
		tail=node;
		size++;
	}
	
	public void insertatpos(int val, int index) {
	    if (index == 0) {           // Case 1: Inserting at the beginning
	        insertatfirst(val);
	        return;
	    }
	    if (index == size) {        // Case 2: Inserting at the end
	        insertatlast(val);
	        return;
	    }
	    
	    
	    //temp = head;: The temp pointer is initialized to the head of the linked list. This means it already represents index 0 at the start of the loop.
	 //   i = 1: The loop starts at 1 because you are moving to the first node after the head. The loop will traverse the list, stopping when it reaches the node just before the target index.
	    Node temp = head;           // Start at the head
	    for (int i = 1; i < index; i++) {  // Traverse to the node before the target position
	        temp = temp.next;
	    }
	    Node node = new Node(val, temp.next);  // Create a new node linking it to the next node
	    temp.next = node;           // Update the previous node to link to the new node
	    size++;                     // Increment the size of the list
	}

	

}
