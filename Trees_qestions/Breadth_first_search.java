package Trees_qestions;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Breadth_first_search {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        /*The method offer(E e) is used to add an element to the queue. In this case, root is the TreeNode that represents the root of the binary tree.*/

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
            	
                TreeNode currNode = queue.poll();
                currLevel.add(currNode.val);
                
                if (currNode.left != null) {
                    queue.offer(currNode.left);
                }
                
                if (currNode.right != null) {
                    queue.offer(currNode.right); // Fixed this line
                }
            }
            result.add(currLevel);
        }
        return result;
    }

    public static void main(String[] args) {
        // Example to test the BFS implementation
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Breadth_first_search bfs = new Breadth_first_search();
        List<List<Integer>> result = bfs.levelOrder(root);
        
        System.out.println(result); // Expected output: [[1], [2, 3], [4, 5]]
    }
}


/*Removing and Retrieving an Element:

The poll() method is called on the queue. This method retrieves and removes the head of the queue (the node that has been in the queue the longest).*/