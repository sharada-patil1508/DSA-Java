package Trees_qestions;
//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
//114

public class Flatten_Binary_Tree_to_ll {
	
	public void flatten(TreeNode root) {
		
	        TreeNode currnode=root;
	        while(currnode!=null)
	        {
	        	TreeNode temp=currnode.left;
	        	while(temp!=null)
	        	{
	        		temp=temp.right;
	        	}
	        	temp.right=currnode.right;
	        	currnode.right=currnode.left;
	        	currnode.left=null;
	        }
	        currnode=currnode.left;
	  }

	public static void main(String[] args) {
		
	}

}
