package Mycode;
import java.util.*;
public class Topologysort {

		public static List<Integer> topologicalSort(List<List<Integer>> adj, int V){

		 //Vector to store indegree of each vertex
		 int[] indegree = new int[V];
		 for(List<Integer> list : adj)
		 for(int vertex : list)
		 indegree[vertex]++;

		
		 Queue<Integer> q = new LinkedList<>();
		 for(int i =0; i<V; i++)
		 if(indegree[i]==0)
		 q.add(i);
		 List<Integer> result = new ArrayList<>();
		 while(!q.isEmpty()) {
		 int node = q.poll();
		 result.add(node);


		 for(int adjacent : adj.get(node)) {
		 indegree[adjacent]--;
		 if(indegree[adjacent] == 0)
		 q.add(adjacent);
		 }
		 }

		 //Check for cycle
		 if(result.size()!=V) {
		 System.out.println("Graph contains CYCLE!");
		 return new ArrayList<>();
		 }
		 return result;
		}
		public static void main(String args[]) {
		 int n=4; // Number of nodes

		 //Edges
		 List<List<Integer>> edges = Arrays.asList(
		 Arrays.asList(0, 1),
		Arrays.asList(1, 2),
		Arrays.asList(0, 2),Arrays.asList(0, 3),Arrays.asList(1, 3)
		 );

		 //Graph represented as an adjacency list
		 List<List<Integer>> adj = new ArrayList<>();
		 for(int i=0; i<n; i++)
			 adj.add(new ArrayList<>());

		 //Constructing adjacency List
		 for(List<Integer> edge : edges)
		 adj.get(edge.get(0)).add(edge.get(1));

		 //Performing topological sort
		 System.out.println("Topological sorting of the graph:");
		 List<Integer> result = topologicalSort(adj, n);

		 //Displaying result
		 for(int vertex : result)
			 System.out.print(vertex + " ");



	}

}
