package Trees_qestions;

import java.util.*;


/*class Node1
{
	int val;
	Node1 left;
	Node1 right;
	
	public Node1(int val)
	{
		this.val=val;
	}
}

//https://leetcode.com/problems/average-of-levels-in-binary-tree/
public class Avg_of_level_int_bt {

		 public   List<Double> levelOrder(Node1 root) {
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

	
	public static void main(String[] args)
	{
		Node1 root=new Node1(1);
		root.left=new Node1(2);
		root.right=new Node1(3);
		root.left.left=new Node1(4);
		root.left.right=new Node1(5);
		
		 Avg_of_level_int_bt bfs=new   Avg_of_level_int_bt();
		 List<Double> result=bfs. levelOrder(root);
		 System.out.println(result);
	}*/


