package Trees_qestions;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
//236

public class Lowest_comman_ancestor_BT {
	
	  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		  
		  if(root==null)
		  {
			  return null;
		  }
		  
		  if(root==p||root==q)
		  {
			  return root;
		  }
	       
		  TreeNode left=lowestCommonAncestor(root.left,p,q); 
		  TreeNode right=lowestCommonAncestor(root.right,p,q); 
		  
		  if(left!=null&&right!=null)
		  {
			  return root;
		  }
		  return  left==null?right:left;
		  
	    }

	public static void main(String[] args) {
		

	}

}


/*Step-by-Step Trace
Initial Call: lowestCommonAncestor(root = 3, p = 2, q = 0)

Check root: 3
Is 3 equal to p (2)? No
Is 3 equal to q (0)? No
Proceed to left subtree: lowestCommonAncestor(root.left = 5, p = 2, q = 0)
Second Call: lowestCommonAncestor(root = 5, p = 2, q = 0)

Check root: 5
Is 5 equal to p (2)? No
Is 5 equal to q (0)? No
Proceed to left subtree: lowestCommonAncestor(root.left = 6, p = 2, q = 0)
Third Call: lowestCommonAncestor(root = 6, p = 2, q = 0)

Check root: 6
Is 6 equal to p (2)? No
Is 6 equal to q (0)? No
Proceed to left subtree: lowestCommonAncestor(root.left = null, p = 2, q = 0)
Fourth Call: lowestCommonAncestor(root = null, p = 2, q = 0)

Check root: null
Return null (base case reached).
Return to Third Call (root = 6):

Proceed to right subtree: lowestCommonAncestor(root.right = null, p = 2, q = 0)
Fifth Call: lowestCommonAncestor(root = null, p = 2, q = 0)

Check root: null
Return null (base case reached).
Return to Third Call (root = 6):

Left result: null
Right result: null
Since both are null, return null to parent (node 5).
Return to Second Call (root = 5):

Proceed to right subtree: lowestCommonAncestor(root.right = 2, p = 2, q = 0)
Sixth Call: lowestCommonAncestor(root = 2, p = 2, q = 0)

Check root: 2
Is 2 equal to p (2)? Yes, return 2.
Return to Second Call (root = 5):

Left result: null
Right result: 2
Since only the right result is non-null, return 2 to parent (node 3).
Return to Initial Call (root = 3):

Proceed to right subtree: lowestCommonAncestor(root.right = 1, p = 2, q = 0)
Seventh Call: lowestCommonAncestor(root = 1, p = 2, q = 0)

Check root: 1
Is 1 equal to p (2)? No
Is 1 equal to q (0)? No
Proceed to left subtree: lowestCommonAncestor(root.left = 0, p = 2, q = 0)
Eighth Call: lowestCommonAncestor(root = 0, p = 2, q = 0)

Check root: 0
Is 0 equal to p (2)? No
Is 0 equal to q (0)? Yes, return 0.
Return to Seventh Call (root = 1):

Proceed to right subtree: lowestCommonAncestor(root.right = 8, p = 2, q = 0)
Ninth Call: lowestCommonAncestor(root = 8, p = 2, q = 0)

Check root: 8
Is 8 equal to p (2)? No
Is 8 equal to q (0)? No
Proceed to left subtree: lowestCommonAncestor(root.left = null, p = 2, q = 0)
Tenth Call: lowestCommonAncestor(root = null, p = 2, q = 0)

Check root: null
Return null (base case reached).
Return to Ninth Call (root = 8):

Proceed to right subtree: lowestCommonAncestor(root.right = null, p = 2, q = 0)
Eleventh Call: lowestCommonAncestor(root = null, p = 2, q = 0)

Check root: null
Return null (base case reached).
Return to Ninth Call (root = 8):

Left result: null
Right result: null
Since both are null, return null to parent (node 1).
Return to Seventh Call (root = 1):

Left result: 0
Right result: null
Since only the left result is non-null, return 0 to parent (node 3).
Return to Initial Call (root = 3):

Left result: 2
Right result: 0
Since both results are non-null (2 from left subtree and 0 from right subtree), 3 is the lowest common ancestor.*/
