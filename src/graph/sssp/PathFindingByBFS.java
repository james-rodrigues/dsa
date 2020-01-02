package graph.sssp;

import java.util.ArrayList;
import java.util.LinkedList;
import node.GraphNode;

/**
 * The Class PathFindingByBFS.
 */
public class PathFindingByBFS {

	/** The node list. */
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

	/**
	 * Instantiates a new path finding by BFS.
	 *
	 * @param nodeList the node list
	 */
	// Constructor
	public PathFindingByBFS(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}// end of method

	/**
	 * Path print.
	 *
	 * @param node the node
	 */
	// Print path of each of the vertex from source
	public static void pathPrint(GraphNode node) {
		if (node.getParent() != null)
			pathPrint(node.getParent()); // recursive call to parent
		System.out.print(node + " ");
	}// end of method

	/**
	 * BFS for SSSP.
	 *
	 * @param node the node
	 */
	// BFS Traversal by a source node
	void BFSForSSSP(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<>();
		queue.add(node); // add source node to queue
		while (!queue.isEmpty()) {
			GraphNode presentNode = queue.remove(0);
			presentNode.setVisited(true);
			System.out.print("Printing path for node " + presentNode.getName() + ": ");
			pathPrint(presentNode);
			System.out.println();
			for (GraphNode neighbor : presentNode.getNeighbors()) { // for each neighbor of present node
				if (!neighbor.isVisited()) {
					queue.add(neighbor);
					neighbor.setVisited(true);
					neighbor.setParent(presentNode);
				} // end of if
			} // end of for loop
		} // end of while loop
	}// end of method

	/**
	 * Adds the undirected edge.
	 *
	 * @param i the i
	 * @param j the j
	 */
	// add an undirected edge between two nodes
	public void addUndirectedEdge(int i, int j) {
		GraphNode first = nodeList.get(i);
		GraphNode second = nodeList.get(j);
		first.getNeighbors().add(second);
		second.getNeighbors().add(first);
	}// end of method

}// end of class