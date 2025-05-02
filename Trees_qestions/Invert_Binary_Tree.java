package Trees_qestions;
//https://leetcode.com/problems/invert-binary-tree/description/
//226
//DFS
class TreeNode3
{
	int val;
	TreeNode3 left;
	TreeNode3 right;
	
	TreeNode3(int x)
	{
		val=x;
	}
	
}
public class Invert_Binary_Tree {
	
	public static TreeNode3 invertTree(TreeNode3 root) {
		if(root==null)
		{
			return null;
		}
		
		TreeNode3 left=invertTree(root.left);
		TreeNode3 right=invertTree(root.right);
		
		root.left=right;
		root.right=left;
		
		return root;
        
    }
	
	public static void inorder(TreeNode3 root)
	{
		if(root==null)
		{
			return;
		}
		
		inorder(root.left);
		System.out.println(root.val+" ");
		inorder(root.right);
	}

	
	public static void main(String[] args) {
		TreeNode3 root=new TreeNode3(4);
		root.left=new TreeNode3(2);
		root.right=new TreeNode3(7);
		root.left.left=new TreeNode3(1);
		root.left.right=new TreeNode3(3);
		root.right.left=new TreeNode3(6);
		root.right.right=new TreeNode3(9);
		
		System.out.println("original tree(inorder)");
		inorder(root);
		System.out.println();
		
		root=invertTree(root);  //mirror==invertTree
		
		System.out.println("mirror tree if (inorder)");
		inorder(root);
		
		

	}

}
