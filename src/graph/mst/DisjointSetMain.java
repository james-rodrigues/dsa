package graph.mst;

import java.util.ArrayList;
import node.WeightedNode;

/**
 * The Class DisjointSetMain.
 */
public class DisjointSetMain {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		// Constructor for ArrayList
		ArrayList<WeightedNode> nodeList = new ArrayList<>();

		// create 10 nodes: 1-10
		for (int i = 0; i < 10; i++) {
			nodeList.add(new WeightedNode("" + (char) (65 + i)));
		}

		// Calling DisjointSet
		DisjointSet.driver(nodeList);

	}// end of method
}// end of class