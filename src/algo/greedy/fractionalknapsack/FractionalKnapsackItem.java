package algo.greedy.fractionalknapsack;

/**
 * The Class FractionalKnapsackItem.
 */
public class FractionalKnapsackItem {
	
	/** The index. */
	private int index;
	
	/** The value. */
	private int value;
	
	/** The weight. */
	private int weight;
	
	/** The ratio. */
	private double ratio;

	/**
	 * Instantiates a new fractional knapsack item.
	 *
	 * @param index the index
	 * @param value the value
	 * @param weight the weight
	 */
	//constructor
	public FractionalKnapsackItem(int index, int value, int weight) {
		this.index = index;
		this.value = value;
		this.weight = weight;
		ratio = value * 1.0 / weight;
	}//end of method
	

	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}//end of method

	
	/**
	 * Sets the index.
	 *
	 * @param index the new index
	 */
	public void setIndex(int index) {
		this.index = index;
	}//end of method
	

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public int getValue() {
		return value;
	}//end of method
	

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(int value) {
		this.value = value;
	}//end of method
	

	/**
	 * Gets the weight.
	 *
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}//end of method
	

	/**
	 * Sets the weight.
	 *
	 * @param weight the new weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}//end of method
	

	/**
	 * Gets the ratio.
	 *
	 * @return the ratio
	 */
	public double getRatio() {
		return ratio;
	}//end of method

	
	/**
	 * Sets the ratio.
	 *
	 * @param ratio the new ratio
	 */
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}//end of method

	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Item index=" + index + ", value=" + value + ", weight=" + weight + ", ratio=" + ratio + "]";
	}//end of method

}//end of class
