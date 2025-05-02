package Trees_qestions;
//https://leetcode.com/problems/diameter-of-binary-tree/description/
//534
//DFS

class TreeNode2
{
	int val;
	TreeNode2 left;
	TreeNode2 right;
	
	TreeNode2(int x)
	{
		val=x;
	}
}
public class Daimeter_of_tree {
	
	int diameter=0;
	
	 public int diameterOfBinaryTree(TreeNode2 root) {
	     height(root);
	   //  System.out.println(ans);
	        return diameter-1;
	    }
	 
	public int height(TreeNode2 node)
	 {
		 if(node==null)
		 {
			 return 0;
		 }
		 
		 int leftHeight=height(node.left);
		 int rightHeight=height(node.right);
		 
		 int dia=leftHeight+rightHeight+1;
		 diameter=Math.max(diameter, dia);
		 
		 return Math.max(leftHeight, rightHeight)+1;
	 }
	 
	 
	 
	public static void main(String[] args) {
		
		TreeNode2 root=new TreeNode2(1);
		root.left=new TreeNode2(2);
		root.right=new TreeNode2(3);
		root.left.left=new TreeNode2(4);
		root.left.right=new TreeNode2(5);
		Daimeter_of_tree dfs=new Daimeter_of_tree();
		int res=dfs.diameterOfBinaryTree(root);
		System.out.println(res);
	
	}

}

/*Detailed Step-by-Step Execution
Start at the root node (1):
Call height(node 1).
Move to the left child (2):
Call height(node 2).
Move to the left child of 2 (4):
Call height(node 4).
Both children of 4 are null, so it returns 0 for both.
Calculates height for 4: max(0, 0) + 1 = 1.
Backtrack to node 2, now check the right child (5):
Call height(node 5).
Similar to 4, it returns 1 after both children are null.
At node 2, calculate:
leftHeight = 1 (from 4), rightHeight = 1 (from 5).
Diameter at 2: 1 + 1 + 1 = 3.
Update diameter = 3.
Return height for 2: max(1, 1) + 1 = 2.
Backtrack to root node (1), now check right child (3):
Call height(node 3).
Both children are null, return 0.
Height for 3: 0 + 1 = 1.
Finally, at the root node (1):
leftHeight = 2 (from 2), rightHeight = 1 (from 3).
Diameter at 1: 2 + 1 + 1 = 4.
Update diameter = 4.
Return height for 1: max(2, 1) + 1 = 3.
Conclusion
The final diameter calculated in the diameterOfBinaryTree method is 4.
The output will print 3 because of the adjustment (diameter - 1), which is the number of edges in the longest path of the tree.
*/
