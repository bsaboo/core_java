package datastructures;

import java.util.LinkedList;
import java.util.Stack;

public class DepthFirstSearch {

	private static class Graph {
		private LinkedList<Integer>[] adj;
		private int V;
		private int E;

		public Graph(int nodes) {
			this.V = nodes;
			this.E = 0;
			this.adj = new LinkedList[nodes];
			for (int v = 0; v < V; v++) {
				adj[v] = new LinkedList<>();
			}

		}

		public void addEdges(int u, int v) {
			adj[u].add(v);
			adj[v].add(u);
			E++;
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(V + " vertices, " + E + " edges " + "\n");

			for (int i = 0; i < V; i++) {
				sb.append(i + ":");
				for (int w : adj[i]) {
					sb.append(w + " ");
				}
				sb.append("\n");
			}
			return sb.toString();
		}

		public void dfs(int s) {
			boolean[] visited = new boolean[V];
			Stack<Integer> stack = new Stack<>();
			stack.push(s);

			while (!stack.isEmpty()) {
				int u = stack.pop();
				if (!visited[u]) {
					visited[u] = true;
					System.out.print(u + " ");
					
					for(int v: adj[u]) {
						if(!visited[v]) {
							stack.push(v);
						}
					}
				}

			}

		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		graph.addEdges(0, 1);
		graph.addEdges(1, 2);
		graph.addEdges(2, 3);
		graph.addEdges(3, 0);
		graph.addEdges(2, 4);
		System.out.println(graph.toString());
		graph.dfs(0);


	}

}
