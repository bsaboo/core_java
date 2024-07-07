package datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	private static class Graph {

		private int V;
		private int E;
		private LinkedList<Integer>[] adj;

		public Graph(int nodes) {
			this.V = nodes;
			this.E = 0;
			this.adj = new LinkedList[nodes];

			for (int v = 0; v < V; v++) {
				adj[v] = new LinkedList<>();
			}

		}

		public void addEdges(int x, int y) {
			adj[x].add(y);
			adj[y].add(x);
			E++;
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(V + " vertices " + E + " Edges" + "\n");
			for (int v = 0; v < V; v++) {
				sb.append(v + " : ");
				for (int w : adj[v]) {
					sb.append(w + " ");
				}
				sb.append("\n");
			}

			return sb.toString();
		}

		public void bfs(int s) {

			boolean[] visited = new boolean[V];
			Queue<Integer> queue = new LinkedList<>();

			queue.offer(s);
			visited[s] = true;

			while (!queue.isEmpty()) {
				int u = queue.poll();
				System.out.print(u + " ");

				for (int v : adj[u]) {
					if (!visited[v]) {
						queue.offer(v);
						visited[v] = true;
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
		graph.bfs(0);

	}

}
