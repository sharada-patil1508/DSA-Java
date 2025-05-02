package Trees_qestions;

public class Path_Sum {
	
	public boolean hasPathSum(TreeNode root, int targetSum) {
		
		if(root==null)
		{
			return false;
		}
		
		if(root.val==targetSum&&root.left==null&&root.right==null)
		{
			return true;
		}
		
		return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
		
        
    }
	
//https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
	//129
		public int sumNumbers(TreeNode root) {
			return helper(root,0);
        
			
    }
		int helper(TreeNode node,int sum)
		{
			if(node==null)
			{
				return 0;
			}
			sum=sum*10+node.val;
			
			if(node.left==null&&node.right==null)
			{
				return sum;
			}
			return helper(node.left,sum)+helper(node.right,sum);
		}
	

		//https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
		//124
		int ans=Integer.MIN_VALUE;
		public int maxPathSum(TreeNode root)
		{
			helper(root);
			return ans;
		}
		int helper(TreeNode node)
		{
			if(node==null)
			{
				return 0;
			}
			 int left=helper(node.left);
			 int right=helper(node.right);
			 
			 left=Math.max(0, left);
			 right=Math.max(0, right);
			 
			 int pathsum=left+right+node.val;
			 
			 ans=Math.max(ans, pathsum);
			 
			 return Math.max(left, right)+node.val;
		}
	public static void main(String[] args) {
		

	}

}
