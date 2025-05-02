package Graphs;
import java.util.*;
public class Basics {
	static class Edge
	{
		int src;
		int dest;
		
		public Edge(int s,int e)
		{
			this.src=s;
			this.dest=e;
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
		graph[1].add(new Edge(1,2)); 
		graph[1].add(new Edge(1,3));
		
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,1));
		graph[2].add(new Edge(2,3));
		
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,2));
	}

	public static void main(String[] args) {
		int v=4;
		ArrayList<Edge> graph[]=new ArrayList[v];
		CreateGraph(graph);
		
		//print 2's neighbours
		for(int i=0;i<graph[1].size();i++)
		{
			Edge e=graph[1].get(i);
			System.out.print(e.dest+" ");
		}
	

	}

}
