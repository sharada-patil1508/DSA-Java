package Trees_qestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-right-side-view/description/
//199
public class Binary_tree_right_view {
	
	public static  class Node
	{
		Node left;
		Node right;
		int val;
		
		public Node(int val)
		{
			this.val=val;
		}
	}
	
	public Node root;
	 public List<Integer> rightSideView(Node root) {
		 
		 List<Integer>  result = new ArrayList<>();

	        if (root == null) {
	            return result;
	        }

	        Queue<Node> queue = new LinkedList<>();
	        queue.offer(root);

	        while (!queue.isEmpty()) {
	            int levelSize = queue.size();
	         
	            
	            for (int i = 0; i < levelSize; i++) {
	                Node currNode = queue.poll();
	               
	                if(i==levelSize-1)
	                {
	                	result.add(currNode.val);
	                }
	               
	                if (currNode.left != null) {
	                    queue.offer(currNode.left);
	                }
	                if (currNode.right != null) {
	                    queue.offer(currNode.right); // Fixed this line
	                }
	            }
	           
	        }
	        return result;
	        
	    }

	public static void main(String[] args) {
		
		Binary_tree_right_view tree=new Binary_tree_right_view();
		Node root=new Node(6);
		root.left=new Node(4);
		root.right=new Node(10);
		root.left.left=new Node(2);
		root.left.right=new Node(5);
		root.right.left=new Node(8);
		root.right.right=new Node(20);
		root.left.left.left=new Node(31);
		
		List<Integer> ans=tree.rightSideView(root);
		System.out.println(ans);
		
	}

}
