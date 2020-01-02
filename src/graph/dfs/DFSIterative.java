package graph.dfs;

import java.util.*;
import node.GraphNode;

/**
 * The Class DFSIterative.
 */
public class DFSIterative {

	/** The node list. */
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

	/**
	 * Instantiates a new DFS iterative.
	 *
	 * @param nodeList the node list
	 */
	public DFSIterative(ArrayList<GraphNode> nodeList) {

		this.nodeList = nodeList;
	}

	/**
	 * Dfs.
	 */
	void dfs() {
		// if a node is unvisited then run dfs on it
		for (GraphNode node : nodeList) {
			if (!node.isVisited())
				dfsVisit(node);
		}
	}

	/**
	 * Dfs visit.
	 *
	 * @param node the node
	 */
	// dfs traversal by a source node
	void dfsVisit(GraphNode node) {
		// make an empty stack
		Stack<GraphNode> stack = new Stack<>();
		// add source node to stack
		stack.push(node);
		// while queue is not empty
		while (!stack.isEmpty()) {
			// pop a node from stack
			GraphNode presentNode = stack.pop();
			// mark node as visited
			presentNode.setVisited(true);
			// print the node
			System.out.print(presentNode.getName() + " ");
			// for each neighbor of present node
			for (GraphNode neighbor : presentNode.getNeighbors()) {
				// if neighbor is not visited then add it to queue
				if (!neighbor.isVisited()) {

					stack.add(neighbor);
					neighbor.setVisited(true);
				}
			}

		}
	}

	/**
	 * Adds the undirected edge.
	 *
	 * @param i the i
	 * @param j the j
	 */
	// add an undirected edge between two nodes
	public void addUndirectedEdge(int i, int j) {
		GraphNode first = nodeList.get(i - 1);
		GraphNode second = nodeList.get(j - 1);
		first.getNeighbors().add(second);
		second.getNeighbors().add(first);
	}

}
