package Graphs;

import java.util.ArrayList;

public class S_D_W_Basics {

	static class Edge
	{
		int src;
		int dest;
		int wt;
		
		public Edge(int s,int e,int w)
		{
			this.src=s;
			this.dest=e;
			this.wt=w;
		}
	}
	
	public static void CreateGraph(ArrayList<Edge> graph[])
	{
		//initially the list is null so we cant add the values,so make it empty
		//then only we can add the values to it
		//so the below code will initilizes null arraylist to empty arraylist
		for(int i=0;i<graph.length;i++)
		{
			graph[i]=new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0,2,2)); 
		
		graph[1].add(new Edge(1,2,10)); 
		graph[1].add(new Edge(1,3,0));
		
		graph[2].add(new Edge(2,0,2));
		graph[2].add(new Edge(2,1,10));
		graph[2].add(new Edge(2,3,-1));
		
		graph[3].add(new Edge(3,1,-1));
		graph[3].add(new Edge(3,2,0));
	}

	public static void main(String[] args) {
		int v=4;
		ArrayList<Edge> graph[]=new ArrayList[v];
		CreateGraph(graph);
		
		//print 2's neighbours
		for(int i=0;i<graph[2].size();i++)
		{
			Edge e=graph[2].get(i);
			System.out.println("{"+e.src+" ,"+e.dest+"}"+"weight is ->"+e.wt);
		}
	

	}

}
