package graph.topologicalsort;

import java.util.ArrayList;

import node.GraphNode;

public class TopologicalSortMain {
	public static void main(String[] args) {
		// Initialize a Arraylist for storing all the graph nodes
		ArrayList<GraphNode> nodeList = new ArrayList<>();

		// create 10 nodes: v1-v10
		for (int i = 1; i < 9; i++) {
			nodeList.add(new GraphNode("V" + i));
		}

		// Constructor
		TopologicalSort graph = new TopologicalSort(nodeList);

		// add edges
		graph.addDirectedEdge(1, 3);
		graph.addDirectedEdge(2, 4);
		graph.addDirectedEdge(2, 3);
		graph.addDirectedEdge(3, 5);
		graph.addDirectedEdge(4, 6);
		graph.addDirectedEdge(5, 6);
		graph.addDirectedEdge(6, 7);
		graph.addDirectedEdge(5, 8);

		// Performing Topologically sort
		graph.topologicalSort();

	}
}
