 package Graphs;
 import java.util.*;

public class Floayds_Wharshell_algm {
	
	public  static void shortest_dist(int[][] matrix)
	{
		int n=matrix.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				//if  element of matrix is not posiible to reachout 
				//so it with big valu
				if(matrix[i][j]==-1)
				{
					matrix[i][j]=(int)(1e9); //1e9: is bigg value
				}
				
				if(i==j)
				{
					matrix[i][j]=0;
				}
			}
		}
		
		for(int k=0;k<n;k++) //via:0,1,2,3
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					matrix[i][j]=Math.min(matrix[i][j], matrix[i][k]+matrix[k][j]);
				}
			}
		}
		
		
		//any negative cycle exits then it will dtect
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
			if(matrix[i][j]<0)
			{
				System.out.println("negative cycle exits");
				
			}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				//if node value is unable to reach then mark it as -1 back only(as like intial)
				if(matrix[i][j]==(int)(1e9))
				{
					matrix[i][j]=-1;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of nodes:");
		int n=sc.nextInt();
		
		int[][] arr=new int[n][n];
		System.out.println("Enter the adjacency matrix (use -1 for no unrechabel path):");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		shortest_dist(arr);
	}

}
