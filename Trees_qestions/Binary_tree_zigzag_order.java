package Trees_qestions;
//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
import java.util.*;
public class Binary_tree_zigzag_order {
	
 class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		
		 TreeNode(int val)
		{
			this.val=val;
		}
	}
	
	public List<List<Integer>> zigzag(TreeNode root)
	{
		List<List<Integer>> result=new ArrayList<>();
		
		if(root==null)
		{
			return result;
		}
		
		Deque<TreeNode> queue=new LinkedList<>();
		queue.offer(root);
		
		boolean reverse=false;
		
		while(!queue.isEmpty())
		{
			int levelSize=queue.size();
			List<Integer> currentLevel=new ArrayList<>(levelSize);
			for(int i=0;i<levelSize;i++)
			{
				if(!reverse)
				{
					TreeNode currentNode=queue.pollFirst();
					currentLevel.add(currentNode.val);
					
					if(currentNode.left!=null)
					{
						queue.addLast(currentNode.left);;
					}
					if(currentNode.right!=null)
					{
						queue.addLast(currentNode.right);
					}
				}else
					
				{
					TreeNode currentNode=queue.pollLast();
					currentLevel.add(currentNode.val);
					
					if(currentNode.right!=null)
					{
						queue.addFirst(currentNode.right);
					}
					if(currentNode.left!=null)
					{
						queue.addFirst(currentNode.left);;
					}
				}
			}
			
			reverse=!reverse;//each time it will make true to fase and false to true 
			                 //so the loop will traverse in zigzag order
			result.add(currentLevel);
		}
		return result;
	}

	
	public static void main(String[] args)
	{
		Binary_tree_zigzag_order tree=new Binary_tree_zigzag_order();
		TreeNode root=tree.new TreeNode(1);
		root.left=tree.new TreeNode(2);
		root.right=tree.new TreeNode(3);
		root.left.left=tree.new TreeNode(4);
		root.left.right=tree.new TreeNode(5);
		root.left.left.left=tree.new TreeNode(8);
		root.left.left.right=tree.new TreeNode(9);
		root.right.right=tree.new TreeNode(7);
		root.right.left=tree.new TreeNode(7);
		root.right.left.right=tree.new TreeNode(11);
		root.right.left.left=tree.new TreeNode(10);
		
		 List<List<Integer>> result = tree.zigzag(root);
	        System.out.println(result);
	}
}
