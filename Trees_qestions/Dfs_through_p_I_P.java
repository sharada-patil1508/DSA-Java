package Trees_qestions;
import java.util.*;

class TreeNode1
{
	int val;
	TreeNode1 left;
	TreeNode1 right;
	
	TreeNode1(int x)
	{
		val=x;
	}
	
}
public class Dfs_through_p_I_P {
	
	
	//depth first search can implementer by using any one of the method from prorder  and Inorder
	public List<Integer> preorder(TreeNode1 root)
	{
		List<Integer> result=new ArrayList<>();
		helper(root,result);
		return result;
	
		
	}
	public void helper(TreeNode1 node,List<Integer> result)
	{
		if(node==null)
		{
			return;
		}
		result.add(node.val);
		helper(node.left,result);
		helper(node.right,result);
		
	}
	 // In-order traversal
    public List<Integer> inOrder(TreeNode1 root) {
        List<Integer> result = new ArrayList<>();
        inOrderHelper(root, result);
        return result;
    }

 
	private void inOrderHelper(TreeNode1 node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inOrderHelper(node.left, result); // Visit left subtree
        result.add(node.val); // Visit the node
        inOrderHelper(node.right, result); // Visit right subtree
    }


	
	
	public static void main(String[] args) {
		
		TreeNode1  root=new TreeNode1(1);
		root.left=new TreeNode1(2);
		root.right=new TreeNode1(3);
		root.left.left=new TreeNode1(4);
		root.left.right=new TreeNode1(5);
		Dfs_through_p_I_P  dfs=new Dfs_through_p_I_P();
		 List<Integer> preOrderResult = dfs.preorder(root);
	        List<Integer> inOrderResult = dfs.inOrder(root);
	        
	        System.out.println("Pre-order traversal: " + preOrderResult); // Expected output: [1, 2, 4, 5, 3]
	        System.out.println("In-order traversal: " + inOrderResult); 

	}

}
