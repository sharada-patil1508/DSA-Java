package Liked_List_questions;
import java.util.Scanner;

public class SortUsingMergsort {
    private Node head;
    private Node tail;
    private int size;

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    // Function to sort the linked list using merge sort
    public Node sortlist(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Split the list into two halves
        Node mid = getMid(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null; // Break the list into two parts

        // Recursively sort both halves
        left = sortlist(left);
        right = sortlist(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    // Function to merge two sorted linked lists
    public Node merge(Node first, Node second) {
        Node dummy = new Node(-1); // Dummy node to simplify the merge process
        Node tail = dummy;

        while (first != null && second != null) {
            if (first.value <= second.value) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes
        tail.next = (first != null) ? first : second;

        return dummy.next; // Return the merged list's head (skip the dummy node)
    }

    // Function to get the middle node of the linked list
    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Function to insert a node at the beginning of the list
    public void insertatfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Function to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        SortUsingMergsort list = new SortUsingMergsort();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in the list:");
        int n = sc.nextInt();

        System.out.println("Enter elements of the list:");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.insertatfirst(a);
        }

        System.out.println("Original list:");
        list.display();

        // Sort the list
        list.head = list.sortlist(list.head);

        System.out.println("Sorted list:");
        list.display();

        sc.close();  // Close the scanner to prevent resource leak
    }
}
