package Trees_qestions;
import java.util.*;


public class Height_of_tree {
	public static class Node
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
	int diameter=0;
	
	
	
	public static int fun(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		
		int left=fun(node.left);
		int right=fun(node.right);
		
		return Math.max(left, right)+1;
	}
	
	
	public static void main(String[] args) {
		
		Node root=new Node(4);
		root.left=new Node(2);
		root.right=new Node(7);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right.left=new Node(6);
		root.right.left=new Node(9);
		
		
		Height_of_tree tree=new Height_of_tree();
		int ans=tree.fun(root);
		System.out.println(ans);
	}

}
