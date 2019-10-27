package node;

import java.util.*;

/**
 * The Class GraphNode.
 */
public class GraphNode {

	/** The name. */
	private String name;

	/** The index. */
	private int index; // index is used to map this Node's name with index of Adjacency Matrix' cell#

	/** The neighbors. */
	private ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();

	/** The is visited. */
	private boolean isVisited = false;

	/** The parent. */
	private GraphNode parent;

	/**
	 * Instantiates a new graph node.
	 *
	 * @param name  the name
	 * @param index the index
	 */
	public GraphNode(String name, int index) {
		this.name = name;
		this.index = index;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Sets the index.
	 *
	 * @param index the new index
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Gets the neighbors.
	 *
	 * @return the neighbors
	 */
	public ArrayList<GraphNode> getNeighbors() {
		return neighbors;
	}

	/**
	 * Sets the neighbors.
	 *
	 * @param neighbors the new neighbors
	 */
	public void setNeighbors(ArrayList<GraphNode> neighbors) {
		this.neighbors = neighbors;
	}

	/**
	 * Checks if is visited.
	 *
	 * @return true, if is visited
	 */
	public boolean isVisited() {
		return isVisited;
	}

	/**
	 * Sets the visited.
	 *
	 * @param isVisited the new visited
	 */
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	/**
	 * Gets the parent.
	 *
	 * @return the parent
	 */
	public GraphNode getParent() {
		return parent;
	}

	/**
	 * Sets the parent.
	 *
	 * @param parent the new parent
	 */
	public void setParent(GraphNode parent) {
		this.parent = parent;
	}

	/**
	 * Instantiates a new graph node.
	 *
	 * @param name the name
	 */
	public GraphNode(String name) {
		this.name = name;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return name;
	}

}
