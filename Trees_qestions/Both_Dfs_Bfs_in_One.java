package Trees_qestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class Both_Dfs_Bfs_in_One {
	

    // Make Node a static inner class
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int x) {
            this.val = x;
        }
    }

    Node root;

    public static List<List<Integer>> levelorder(Node root)
    {
    	
    	List<List<Integer>> res=new ArrayList<>();
    	if(root==null)
    	{
    		return res;
    	}
    	
    	Queue<Node> q=new LinkedList<>();
    	
    	q.add(root);
    	
    	while(!q.isEmpty())
    	{
    		int currsize=q.size();
    		List<Integer> currlist=new ArrayList<>(currsize);
    		for(int i=0;i<currsize;i++)
    		{
    			Node currnode=q.remove();
    			currlist.add(currnode.val);
    			
    			if(currnode.left!=null)
    			{
    				q.add(currnode.left);
    			}
    			if(currnode.right!=null)
    			{
    				q.add(currnode.right);
    			}
    		}
    		res.add(currlist);
    	}
    	return res;
    	
    }
    
    
    public static void dfs(Node node)
    {
    	if(node==null)
    	{
    		return;
    	}
    	System.out.println(node.val+" ");
    	dfs(node.left);
    	dfs(node.right);
    	
    }

    public static void main(String[] args) {
        // Create tree structure
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Both_Dfs_Bfs_in_One tree = new Both_Dfs_Bfs_in_One();
        List<List<Integer>> result = tree.levelorder(root);

        System.out.println("dfs expansion:");
        dfs(root);
        
       // System.out.println(result); // Expected output: [[1], [2, 3], [4, 5]]
    }

}
