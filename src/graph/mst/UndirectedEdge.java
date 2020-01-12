package graph.mst;

import node.WeightedNode;

/**
 * The Class UndirectedEdge.
 */
public class UndirectedEdge {

	/** The first. */
	private WeightedNode first;

	/** The second. */
	private WeightedNode second;

	/** The weight. */
	private int weight;

	/**
	 * Instantiates a new undirected edge.
	 *
	 * @param first  the first
	 * @param second the second
	 * @param weight the weight
	 */
	public UndirectedEdge(WeightedNode first, WeightedNode second, int weight) {
		this.first = first;
		this.second = second;
		this.weight = weight;
	}

	/**
	 * Gets the first.
	 *
	 * @return the first
	 */
	public WeightedNode getFirst() {
		return first;
	}

	/**
	 * Sets the first.
	 *
	 * @param first the new first
	 */
	public void setFirst(WeightedNode first) {
		this.first = first;
	}

	/**
	 * Gets the second.
	 *
	 * @return the second
	 */
	public WeightedNode getSecond() {
		return second;
	}

	/**
	 * Sets the second.
	 *
	 * @param second the new second
	 */
	public void setSecond(WeightedNode second) {
		this.second = second;
	}

	/**
	 * Gets the weight.
	 *
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Sets the weight.
	 *
	 * @param weight the new weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Edge (" + first.getName() + "," + second.getName() + "), weight=" + weight;
	}

}
