package Trees_qestions;

// Import statements
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Definition for the tree node
class TNode {
    int val;
    TNode left;
    TNode right;

    public TNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TNode currNode = queue.poll();
                currLevel.add(currNode.val);
                if (currNode.left != null) {
                    queue.offer(currNode.left);
                }
                if (currNode.right != null) {
                    queue.offer(currNode.right);
                }
            }
            result.add(0,currLevel); // Add current level to the result
        }
        return result;
    }

    public static void main(String[] args) {
        // Create a binary tree for testing
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);

        // Create an instance of the class and get the level order traversal
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = traversal.levelOrder(root);

        // Print the result
        System.out.println(result);
    }
}
