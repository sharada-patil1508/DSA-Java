package Trees_qestions;

import java.util.*;

 class Node
{
	int val;
	Node left;
	Node right;
	
	public Node(int val)
	{
		this.val=val;
	}
}

	public class levelOrder_qestions {
	

	public List<List<Integer>> levelOrder1(Node root)
	{
		List<List<Integer>> result=new ArrayList<>();
		
		if(root==null)
		{
			return result;
		}
		
		Queue<Node> queue=new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty())
		{
			int levelsize=queue.size();
			List<Integer> currlevel=new ArrayList<>(levelsize);
			for(int i=0;i<levelsize;i++)
			{
				Node currnode=queue.poll();
				currlevel.add(currnode.val);
				if(currnode.left!=null)
				{
					queue.offer(currnode.left);
				}
				if(currnode.right!=null)
				{
					queue.offer(currnode.right);
				}
			}
			result.add(currlevel);
		}
		return result;
	}


		 public   List<Double> levelOrder(Node root) {
			 List<Double>  result = new ArrayList<>();

		        if (root == null) {
		            return result;
		        }

		        Queue<Node> queue = new LinkedList<>();
		        queue.offer(root);

		        while (!queue.isEmpty()) {
		            int levelSize = queue.size();
		            double avglevel=0;
		            
		            for (int i = 0; i < levelSize; i++) {
		                Node currNode = queue.poll();
		                avglevel+=currNode.val;
		               
		                if (currNode.left != null) {
		                    queue.offer(currNode.left);
		                }
		                if (currNode.right != null) {
		                    queue.offer(currNode.right); // Fixed this line
		                }
		            }
		            avglevel=avglevel/levelSize;
		            result.add(avglevel);
		        }
		        return result;
		    }

		 public Node findsuccessor(Node root,int key)
		 {
			 if(root==null)
			 {
				 return null;
			 }
			 Queue<Node> queue=new LinkedList<>();
			 queue.offer(root);
			 
			 while(!queue.isEmpty())
			 {
				 int levelsize=queue.size();
				 
				 Node currNode=queue.poll();
				 if(currNode.left!=null)
				 {
					 queue.offer(currNode.left);
				 }
				 if(currNode.right!=null)
				 {
					 queue.offer(currNode.right);
				 }if(currNode.val==key)
				 {
					 break;
				 }
			 }
			 return queue.peek();
		 }
		 
	
	public static void main(String[] args)
	{
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		levelOrder_qestions bfs=new levelOrder_qestions();
		/* List<Double> result=bfs. levelOrder(root);
		 System.out.println(result);*/
		Node res=bfs.findsuccessor(root,1);
		System.out.println(res.val);
		
	}
}
