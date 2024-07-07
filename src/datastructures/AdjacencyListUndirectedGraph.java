package datastructures;

import java.util.LinkedList;

public class AdjacencyListUndirectedGraph {

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
	}

	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addEdges(0, 1);
		graph.addEdges(1, 2);
		graph.addEdges(2, 3);
		graph.addEdges(3, 0);
		System.out.println(graph.toString());

	}

}
