package Graphs;

import java.util.*;
import java.util.PriorityQueue;

import Graphs.Basics.Edge;
//hw:print edges

public class Prims_algm_MST {
	static class Edge
	{
		int src;
		int dest;
		int wt;
		
		public Edge(int s,int d,int w)
		{
			this.src=s;
			this.dest=d;
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
		graph[0].add(new Edge(0,1,10)); 
		graph[0].add(new Edge(0,2,15)); 
		graph[0].add(new Edge(0,3,30)); 
		
		
		graph[1].add(new Edge(1,0,10));
		graph[1].add(new Edge(1,3,40));
		
		
		graph[2].add(new Edge(2,0,15));
		graph[2].add(new Edge(2,3,50));
		
		graph[3].add(new Edge(3,1,40));
		graph[3].add(new Edge(3,2,50));
	}
	public static class pair implements Comparable<pair>
	{
		int node;
		int cost;
		
		public pair(int n,int c)
		{
			this.node=n;
			this.cost=c;
		}
		@Override
		public int compareTo(pair p2)
		{
			return this.cost-p2.cost; //ascending order by difault
		}
	}
	
	public static void prims(ArrayList<Edge> graph[],int v)
	{
		PriorityQueue<pair> pq=new PriorityQueue<>();//non-mst
		boolean vis[]=new boolean[v];
	
		int mstcost=0;
		int j=0;
		
		//initialyy pair in queue
		pq.add(new pair(0,0));
		
		while(!pq.isEmpty())
		{
			pair curr=pq.remove();
			if(!vis[curr.node])
			{
				vis[curr.node]=true;
			
				mstcost+=curr.cost;
				
				//to take neighbours of cuuent node
				for(int i=0;i<graph[curr.node].size();i++)
				{
					Edge e=graph[curr.node].get(i);
					if(!vis[e.dest])
					{
						pq.add(new pair(e.dest,e.wt));
					}
				}
			}
		}
		System.out.println("min cost of mst:"+mstcost);
		
	}
	
	
	public static void main(String[] args) {
		int v=4;
		ArrayList<Edge> graph[]=new ArrayList[v];
		CreateGraph(graph);
		prims(graph,v);

	}

}
