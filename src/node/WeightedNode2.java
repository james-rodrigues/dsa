package node;

import java.util.ArrayList;
import java.util.HashMap;

import graph.mst.DisjointSet;

/**
 * The Class WeightedNode2.
 */
public class WeightedNode2 implements Comparable<WeightedNode2> {
	
	/** The name. */
	public String name;

	/** The neighbors. */
	private ArrayList<WeightedNode2> neighbors = new ArrayList<WeightedNode2>();
	
	/** The weight map. */
	private HashMap<WeightedNode2, Integer> weightMap = new HashMap<>();
	
	/** The is visited. */
	private boolean isVisited = false;
	
	/** The parent. */
	private WeightedNode2 parent;
	
	/** The distance. */
	private int distance;
	
	/** The set. */
	private DisjointSet set;

	/**
	 * Instantiates a new weighted node 2.
	 *
	 * @param name the name
	 */
	public WeightedNode2(String name) {
		this.name = name;
		distance = Integer.MAX_VALUE;
	}

	/**
	 * Gets the sets the.
	 *
	 * @return the sets the
	 */
	public DisjointSet getSet() {
		return set;
	}

	/**
	 * Sets the sets the.
	 *
	 * @param set the new sets the
	 */
	public void setSet(DisjointSet set) {
		this.set = set;
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
	 * Gets the neighbors.
	 *
	 * @return the neighbors
	 */
	public ArrayList<WeightedNode2> getNeighbors() {
		return neighbors;
	}

	/**
	 * Sets the neighbors.
	 *
	 * @param neighbors the new neighbors
	 */
	public void setNeighbors(ArrayList<WeightedNode2> neighbors) {
		this.neighbors = neighbors;
	}

	/**
	 * Gets the weight map.
	 *
	 * @return the weight map
	 */
	public HashMap<WeightedNode2, Integer> getWeightMap() {
		return weightMap;
	}

	/**
	 * Sets the weight map.
	 *
	 * @param weightMap the weight map
	 */
	public void setWeightMap(HashMap<WeightedNode2, Integer> weightMap) {
		this.weightMap = weightMap;
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
	public WeightedNode2 getParent() {
		return parent;
	}

	/**
	 * Sets the parent.
	 *
	 * @param parent the new parent
	 */
	public void setParent(WeightedNode2 parent) {
		this.parent = parent;
	}

	/**
	 * Gets the distance.
	 *
	 * @return the distance
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * Sets the distance.
	 *
	 * @param distance the new distance
	 */
	public void setDistance(int distance) {
		this.distance = distance;
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

	/**
	 * Compare to.
	 *
	 * @param o the o
	 * @return the int
	 */
	@Override
	public int compareTo(WeightedNode2 o) {
		return this.distance - o.distance;
	}

}
