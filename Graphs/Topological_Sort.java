package Graphs;
import java.util.*;

import Graphs.ROUGH.Edge;

public class Topological_Sort {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void create(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[1].add(new Edge(1,2));
		graph[1].add(new Edge(1,5));
		
		graph[2].add(new Edge(2,3));
		
		graph[3].add(new Edge(3,4));
		graph[3].add(new Edge(3,6));
		
		
		graph[4].add(new Edge(4,6));
			
		
		graph[5].add(new Edge(5,4));
		
		
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int vis[], Stack<Integer> st) {
        vis[curr] = 1;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == 0) {
                dfs(graph, e.dest, vis, st);
            }
        }
        st.push(curr); // Push the node onto the stack after visiting all neighbors
    }

    public static int[] topology(int v, ArrayList<Edge> graph[]) {
        int vis[] = new int[v];
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < v; i++) {
            if (vis[i] == 0) {
                dfs(graph, i, vis, st);
            }
        }

        int ans[] = new int[v];
        int i = 0;
        while (!st.isEmpty()) {
            ans[i++] = st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        create(graph);

        int[] topoOrder = topology(v, graph);
        System.out.println("Topological Order:");
        for (int node : topoOrder) {
            System.out.print(node + " ");
        }
    }
}
