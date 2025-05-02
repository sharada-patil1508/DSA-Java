package Trees_qestions;
//https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
//230

public class Kth_smallest_element {
	
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
	public static Node root;
	  
	
	public  static int kthSmallest(Node root,int k)
	{
		Node ans=helper(root,k);
		return ans.val;
	}
	   public static Node helper(Node root, int k) {
		   int count=0;
	     
		   if(root==null)
		   {
			   return null;
		   }
		   
		   Node left=helper(root.left,k);
		   if(left!=null)
		   {
			   return left;
		   }
		   count++;
		   
		   if(count==k)
		   {
			   return root;
		   }
		   
		   return helper(root.right,k);
	    }

	public static void main(String[] args) {
		
		Kth_smallest_element tree=new Kth_smallest_element();
		
		Node root=new Node(5);
		root.left=new Node(3);
		root.right=new Node(6);
		root.left.left=new Node(2);
		root.left.right=new Node(4);
		root.left.left.left=new Node(1);
		int ans=kthSmallest(root, 3);
		System.out.println(ans);
		
		

	}

}
