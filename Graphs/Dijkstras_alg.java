package Graphs;
import java.util.*;
public class Dijkstras_alg {
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
	
	public static void create(ArrayList<Edge> graph[])
	{
		for(int i=0;i<graph.length;i++)
		{
			graph[i]=new ArrayList<Edge>();
			
		}
		graph[0].add(new Edge(0,1,2));
		graph[0].add(new Edge(0,2,4));
		
		graph[1].add(new Edge(1,3,7));
		graph[1].add(new Edge(1,2,1));

		graph[2].add(new Edge(2,4,3));
		
		graph[3].add(new Edge(3,5,1));
		
		graph[4].add(new Edge(4,3,2));
		graph[4].add(new Edge(4,5,5));
	}
	
	//che
	public static class pair implements Comparable<pair>
	{
		int node;
		int dist;
		
		public pair(int n,int d)
		{
			this.node=n;
			this.dist=d;
		}
		
		//logic for to consider distance to sort the queue
		
		@Override
		public int compareTo(pair p2)
		{
			return this.dist-p2.dist;//ascending order
			
			//if we want in decenting order then consider 
			//return p2.dist-this.dist;
		}
	}
	
	
	
	public static void dij(ArrayList<Edge> graph[],int src,int V)
	{
		PriorityQueue<pair> pq=new PriorityQueue<>();
		int dist[]=new int[V];
		//see notes
		//intilizing all node weight to infinite except source becouse it is zero
		for(int i=0;i<V;i++)
		{
			 if(i!=src)
			 {
				 dist[i]=Integer.MAX_VALUE;//infitite in java is Integer.MAX_VALUE
				 
			 }
		}
		dist[src]=0;
		boolean vis[]=new boolean[V];
		pq.add(new pair(src,0));
		
		while(!pq.isEmpty())
		{
			pair curr=pq.remove();
			if(!vis[curr.node])
			{
				//if node is not visited then make it true(visited)
				vis[curr.node]=true;
				
				//update neighbours
				for(int i=0;i<graph[curr.node].size();i++)
				{
					Edge e=graph[curr.node].get(i);
					int u=e.src;
					int v=e.dest;
					
					if(!vis[v]&&dist[u]+e.wt<dist[v])
					{
						dist[v]=dist[u]+e.wt;
						//add upadated node to priority queue to sort
						pq.add(new pair(v,dist[v]));
						
					}
					
				}
			}
		}
		
		for(int i=0;i<V;i++)
		{
			System.out.print(dist[i]+" ");
		} 
		System.out.println();
		 
	}

	public static void main(String[] args) {
		int V=6;
		ArrayList<Edge> graph[]=new ArrayList[V]; 
		 create(graph);
		 dij(graph,0, V);

	}

}
