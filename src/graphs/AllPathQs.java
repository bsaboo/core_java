package graphs;

import java.util.ArrayList;

public class AllPathQs {

	static class Edge {
		int src;
		int dest;
		int weight;

		Edge(int s, int d, int w) {
			this.src = s;
			this.dest = d;
			this.weight = w;
		}
	}

	static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0, 1, 2));
		graph[0].add(new Edge(0, 2, 2));

		graph[1].add(new Edge(1, 0, 10));
		graph[1].add(new Edge(1, 3, 10));

		graph[2].add(new Edge(2, 0, 2));
		graph[2].add(new Edge(2, 4, 2));

		graph[3].add(new Edge(3, 1, 10));
		graph[3].add(new Edge(3, 4, 10));
		graph[3].add(new Edge(3, 5, 10));

		graph[4].add(new Edge(4, 2, -1));
		graph[4].add(new Edge(4, 3, -1));
		graph[4].add(new Edge(4, 5, -1));

		graph[5].add(new Edge(5, 3, 0));
		graph[5].add(new Edge(5, 4, -1));
		graph[5].add(new Edge(5, 6, -1));

		graph[6].add(new Edge(6, 5, -1));

	}

	public static void main(String[] args) {
		int vertices = 7;
		ArrayList<Edge> graph[] = new ArrayList[vertices];
		createGraph(graph);

	}

}
