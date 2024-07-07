package datastructures;

public class AdjacencyMatrixUnidirectedGraph {

	private static class Graph {
		private int V; // Number of vertices in grpah
		private int E; // Number of edges in grpah;
		int[][] adjMatrix;

		public Graph(int nodes) {
			this.V = nodes;
			adjMatrix = new int[nodes][nodes];
		}

		public void addEdges(int x, int y) {
			this.adjMatrix[x][y] = 1;
			this.adjMatrix[y][x] = 1;
			E++;
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(V + " vertices, " +E + " edges " + "\n");
			
			for(int i = 0; i < V; i++) {
				sb.append(i + ":");
				for(int w : adjMatrix[i]) {
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
		graph.addEdges(0, 3);
		graph.addEdges(2, 2);
		System.out.println(graph.toString()); 

	}

}
