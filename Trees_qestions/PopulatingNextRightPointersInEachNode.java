package Trees_qestions;

// Definition for the tree node with next pointer
class Node3 {
    int val;
    Node3 left;
    Node3 right;
    Node3 next;

    Node3(int val) {
        this.val = val;
    }
}

public class PopulatingNextRightPointersInEachNode {

    public Node3 connect(Node3 root) {
        if (root == null) {
            return null;
        }

        Node3 leftMost = root;

        while (leftMost.left != null) {
            Node3 current = leftMost;
            while (current != null) {
                current.left.next = current.right;

                if (current.next != null) {
                    current.right.next = current.next.left;
                }

                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }

    public static void main(String[] args) {
        // Create the binary tree
        Node3 root = new Node3(1);
        root.left = new Node3(2);
        root.right = new Node3(3);
        root.left.left = new Node3(4);
        root.left.right = new Node3(5);
        root.right.left = new Node3(6);
        root.right.right = new Node3(7);

        // Connect the next pointers
        PopulatingNextRightPointersInEachNode tree = new PopulatingNextRightPointersInEachNode();
        Node3 res = tree.connect(root);

        // Print the values of next pointers for each node at level 2
        System.out.println("Next pointers at level 2:");
        System.out.println("Node 4's next: " + (root.left.left.next != null ? root.left.left.next.val : "null"));
        System.out.println("Node 5's next: " + (root.left.right.next != null ? root.left.right.next.val : "null"));
        System.out.println("Node 6's next: " + (root.right.left.next != null ? root.right.left.next.val : "null"));
        System.out.println("Node 7's next: " + (root.right.right.next != null ? root.right.right.next.val : "null"));
    }
}
