package Trees_qestions;

public class Tree_traversal {

    private Node root;

    public class Node {
        private int val;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }

    // Method to insert values into the BST
    
    /*
	 * Calls the recursive function insertRec(), passing the root node and val.
The result of insertRec() is assigned back to root, ensuring the tree structure is updated.
	 */
    public void insert(int val) {
        root = insertRec(root, val);
    }

    private Node insertRec(Node node, int val) {
    	
    	/*
    	 * If node == null, it means we've reached an empty spot in the BST where the new node should be inserted.
Create a new Node with the given val and return it.
    	 */
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.val) {
            node.left = insertRec(node.left, val);
        } else if (val > node.val) {
            node.right = insertRec(node.right, val);
        }
        return node;
    }

    // Preorder traversal
    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.getVal() + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // Inorder traversal
    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.getVal() + " ");
            inorder(node.right);
        }
    }

    // Postorder traversal
    public void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.getVal() + " ");
        }
    }

    // Method to populate the tree with an array of integers
    public void populate(int[] nums) {
        for (int num : nums) {
            this.insert(num);
        }
    }

    public static void main(String[] args) {
        Tree_traversal tree = new Tree_traversal(); 
        int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        tree.populate(nums);
        
        System.out.println("Preorder Traversal:");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Postorder Traversal:");
        tree.postorder(tree.root);
        System.out.println();
    }
}
