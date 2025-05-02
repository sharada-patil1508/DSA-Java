package Trees_qestions;

import java.util.Scanner;

public class Trees {
    
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    
    public Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node:");
        int value = scanner.nextInt();
        root = new Node(value); // Assigning the root node
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value + "? (true/false)");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value + ":");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value + "? (true/false)");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value + ":");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, " ");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "    "); // Indent for left child
        display(node.right, indent + "    "); // Indent for right child
    }
    
 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trees tree = new Trees();
        tree.populate(scanner);
        System.out.println("Displaying the tree:");
        tree.display();
        //tree.prettyDisplay();
       
    }
}
