package Trees_qestions;
//https://leetcode.com/problems/validate-binary-search-tree/
//98
public class Valid_BST {
	
	 public boolean isValidBST(TreeNode root) {
		 return helper(root,null,null);
	        
	    }
	 
	 public boolean helper(TreeNode node,Integer low,Integer high)
	 {
		 if(node==null)
		 {
			 return true;
		 }
		 
		 if(low!=null&&node.val<=low)
		 {
			 return false;
		 }
		 if(high!=null&&node.val>=high)
		 {
			 return false;
		 }
		 
		 boolean leftTree=helper(node.left,low,node.val);
		 boolean rightTree=helper(node.right,node.val,high);
		 
		 return leftTree&&rightTree;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
