package Trees_qestions;

public class BinarySearchTree {
    
    private Node root;

    public class Node {
        private int val;
        private int height;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
            this.height = 0; // Initially height is 0 for a new node
        }

        public int getVal() {
            return val;
        }
    }
    
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node insert(int val, Node node) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.val) {
            node.left = insert(val, node.left);
        } else if (val > node.val) {
            node.right = insert(val, node.right);
        }
        
        node.height = Math.max(height(node.left), height(node.right)) + 1; // Fix the height calculation
        return node;
    }

    public void insert(int val) {
        root = insert(val, root);
    }
    
    public boolean balanced() {
        return balanced(root);
    }
    
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 &&
               balanced(node.left) &&
               balanced(node.right);
    }

    public void display() {
        display(root, "Root node");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        
        System.out.println(details + " " + node.getVal());
        
        display(node.left, "Left child of " + node.getVal() + ":");
        display(node.right, "Right child of " + node.getVal() + ":");
    }

    
    public void populate(int[] nums) {
    	//reverse(nums);
        for (int num : nums) {
            this.insert(num);
        }
    }
   /* public void reverse(int[] nums)
    {
    	int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
*/
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(); // Create an instance of BinarySearchTree
        int[] nums = {-10,-3,0,5,9};
        tree.populate(nums);
        tree.display();
        
        System.out.println("Is the tree balanced? " + tree.balanced());
    }
}
