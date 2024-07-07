package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        // Define the number of vertices in the graph
        int numVertices = 7; // Assuming vertices are numbered from 1 to 6

        // Create an array of ArrayList to represent the adjacency list
        List<Integer>[] graph = new ArrayList[numVertices];

        // Initialize each element of the array with an empty ArrayList
        for (int i = 0; i < numVertices; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 2, 5);
        addEdge(graph, 3, 6);
        addEdge(graph, 5, 6);

        // Perform DFS from vertex 1 and print the traversal
        dfs(graph, 1);
    }

    // Function to add an edge to the graph
    private static void addEdge(List<Integer>[] graph, int source, int destination) {
        // Add the edge from source to destination
        graph[source - 1].add(destination);

        // For an undirected graph, you'd also add the reverse edge
        // graph[destination - 1].add(source);
    }

    // Function to perform DFS traversal
    private static void dfs(List<Integer>[] graph, int start) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[graph.length];

        stack.push(start);

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();

            if (!visited[currentVertex - 1]) {
                System.out.print(currentVertex + " "); // Print the visited vertex

                visited[currentVertex - 1] = true;

                for (int neighbor : graph[currentVertex - 1]) {
                    if (!visited[neighbor - 1]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}
