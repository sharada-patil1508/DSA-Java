package Trees_qestions;
import java.util.*;

import Trees_qestions.Rough_work_trss_Qestions.Node;
public class BST_PLUS_ALLTRAVRSALS {

	
		public class Node
		{
			int val;
			Node left;
			Node right;
			
			public Node(int val)
			{
				this.val=val;
			}
		}
		public Node root;
		
		public void populate(Scanner sc)
		{
			System.out.println("enter root value:");
			int val=sc.nextInt();
			root=new Node(val);
			populate(root,sc);
		}
		
		public void populate(Node node,Scanner sc)
		{
			System.out.println("do you want to enter the value to left of "+node.val+":");
			boolean left=sc.nextBoolean();
			if(left)
			{
				System.out.println("enter val to left of "+node.val+":");
				int val=sc.nextInt();
				node.left=new Node(val);
				populate(node.left,sc);
			}
			
			System.out.println("do you want to enter the value to right of "+node.val+":");
			boolean right=sc.nextBoolean();
			if(right)
			{
				System.out.println("enter val to right of "+node.val+":");
				int val=sc.nextInt();
				node.right=new Node(val);
				populate(node.right,sc);
			}
		}
		
		public void display_preorder(Node node)
		{
			if(node!=null)
			{
				System.out.println(node.val);
				display_preorder(node.left);
				display_preorder(node.right);
			}
		}
		
		public void display_inorder(Node node)
		{
			if(node!=null)
			{
				display_preorder(node.left);
				System.out.println(node.val);
				
				display_preorder(node.right);
			}
		}
		
		public void display_postorder(Node node)
		{
			if(node!=null)
			{
				display_preorder(node.left);
				
				
				display_preorder(node.right);
				System.out.println(node.val);
			}
		}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			BST_PLUS_ALLTRAVRSALS tree=new BST_PLUS_ALLTRAVRSALS();
			tree.populate(sc);
			System.out.println("the preorder travrsal is:");
			tree.display_preorder(tree.root);
			System.out.println("the inorder travrsal is:");
			tree.display_inorder(tree.root);
			System.out.println("the postorder travrsal is:");
			tree.display_postorder(tree.root);
		}
	}



