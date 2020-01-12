package graph.apsp;

import java.util.ArrayList;
import node.WeightedNode;

/**
 * The Class FloydWarshall.
 */
public class FloydWarshall {

	/** The node list. */
	ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

	/**
	 * Instantiates a new floyd warshall.
	 *
	 * @param nodeList the node list
	 */
	// Constructor
	public FloydWarshall(ArrayList<WeightedNode> nodeList) {
		this.nodeList = nodeList;
	}

	/**
	 * Floyd warshall.
	 */
	void floydWarshall() {
		int size = nodeList.size();
		int[][] V = new int[size][size];

		// Initializing Distance table from adjacency list
		for (int i = 0; i < size; i++) {
			WeightedNode first = nodeList.get(i);
			for (int j = 0; j < size; j++) {
				WeightedNode second = nodeList.get(j);
				if (i == j)
					V[i][j] = 0;
				else if (first.getWeightMap().containsKey(second)) { // we have direct edge between i & j
					V[i][j] = first.getWeightMap().get(second);
				} else { // no direct edge between i & j, so mark it as infinity [divided by 10 to avoid
							// arithmetic overflow]
					V[i][j] = Integer.MAX_VALUE / 10;
				}
			}
		} // end of loop

		// Floyd Warshall's Algorithm
		for (int k = 0; k < nodeList.size(); k++) {
			for (int i = 0; i < nodeList.size(); i++) {
				for (int j = 0; j < nodeList.size(); j++) {
					if (V[i][j] > V[i][k] + V[k][j]) { // if update possible, then update path
						V[i][j] = V[i][k] + V[k][j]; // this will keep a track on path
					}
				}
			}
		} // end of loop

		// Print table of node with minimum distance and shortest path from each source
		for (int i = 0; i < size; i++) {
			System.out.print("Printing distance list for node " + nodeList.get(i).getName() + ": ");
			for (int j = 0; j < size; j++) {
				// System.out.print(V[i][j] + " ");

				// Print formatting logic not associated with code, above commented line is
				// enough
				if (i == j)
					continue;
				System.out.print("To Node : " + (char) (65 + j) + " Distance : " + V[i][j]);
				if (j != size - 1)
					System.out.print(", ");
			}
			System.out.println();
		}

	}// end of method

	/**
	 * Adds the weighted edge.
	 *
	 * @param i the i
	 * @param j the j
	 * @param d the d
	 */
	// add a weighted edge between two nodes
	public void addWeightedEdge(int i, int j, int d) {
		WeightedNode first = nodeList.get(i - 1);
		WeightedNode second = nodeList.get(j - 1);
		first.getNeighbors().add(second);
		first.getWeightMap().put(second, d);
	}// end of method

}// end of class