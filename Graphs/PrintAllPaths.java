package Graphs;

import java.util.ArrayList;

import Graphs.DFS_Graphs.Edge;

public class PrintAllPaths {
	static class Edge
	{
		int src;
		int dest;
		
		public Edge(int s,int d)
		{
			this.src=s;
			this.dest=d;
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
		graph[0].add(new Edge(0,1)); 
		graph[0].add(new Edge(0,2));
		
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,3));
		
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,4));
		
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,4));
		graph[3].add(new Edge(3,5));
		
		graph[4].add(new Edge(4,2));
		graph[4].add(new Edge(4,3));
		graph[4].add(new Edge(4,5));
		
		graph[5].add(new Edge(5,3));
		graph[5].add(new Edge(5,4));
		graph[5].add(new Edge(5,6));
		graph[5].add(new Edge(6,5));
	}
 


	public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[])
	{
		System.out.println(curr+" ");
		vis[curr]=true;
		
		for(int i=0;i<graph[curr].size();i++)
		{
			Edge e=graph[curr].get(i);
			if(vis[e.dest]==false)
			{
				//recursion call of dfs function
			dfs(graph,e.dest,vis);
			}
		}
	}
	
	public static void printallpaths(ArrayList<Edge> graph[],boolean vis[],int curr,String path,int tar)
	{
		if(curr==tar)
		{
			System.out.println(path);
			return;
		}
		
		for(int i=0;i<graph[curr].size();i++)
		{
			Edge e=graph[curr].get(i);
			if(!vis[e.dest])
			{
				vis[curr]=true;
				printallpaths( graph,vis,e.dest,path+e.dest,tar);
				vis[curr]=false;
			}
		}
	}

	public static void main(String[] args) {
		int v=7;
		ArrayList<Edge> graph[]=new ArrayList[v];
		boolean vis[]=new boolean[v];
		CreateGraph( graph);
		//dfs(graph,0,vis);
		int src=0,tar=5;
		printallpaths(graph,vis,src,"0",tar);
		

	}

}
