package Trees_qestions;
import java.util.*;



public class Rough_work_trss_Qestions {
	
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
	
	Node root;
	
	public static  List<Integer> fun(Node root)
	{
		List<Integer> ans=new ArrayList<>();
		
		if(root==null)
		{
			return ans;
		}
		
		Queue<Node>  q=new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			int size=q.size();
			
			for(int i=0;i<size;i++)
			{
				Node currnode=q.remove();
				
				if(i==size-1)
				{
					ans.add(currnode.val);
				}
				
				if(currnode.left!=null)
				{
					q.add(currnode.left);
				}
				
				if(currnode.right!=null)
				{
					q.add(currnode.right);
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		Rough_work_trss_Qestions tree=new Rough_work_trss_Qestions();
		Node root=new Node(6);
		root.left=new Node(4);
		root.right=new Node(10);
		root.left.left=new Node(2);
		root.left.right=new Node(5);
		root.right.left=new Node(8);
		root.right.right=new Node(20);
		root.left.left.left=new Node(31);
		
		List<Integer> ans=tree.fun(root);
		System.out.println(ans);
		
	}
	
	
	
	
}
