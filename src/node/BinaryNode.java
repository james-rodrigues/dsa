package node;

/**
 * The Class BinaryNode.
 */
public class BinaryNode {

	/** The value. */
	private int value;

	/** The height. */
	private int height;

	/** The left. */
	private BinaryNode left;

	/** The right. */
	private BinaryNode right;

	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}// end of method

	/**
	 * Sets the height.
	 *
	 * @param height the new height
	 */
	public void setHeight(int height) {
		this.height = height;
	}// end of method

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public int getValue() {
		return value;
	}// end of method

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(int value) {
		this.value = value;
	}// end of method

	/**
	 * Gets the left.
	 *
	 * @return the left
	 */
	public BinaryNode getLeft() {
		return left;
	}// end of method

	/**
	 * Sets the left.
	 *
	 * @param left the new left
	 */
	public void setLeft(BinaryNode left) {
		this.left = left;
	}// end of method

	/**
	 * Gets the right.
	 *
	 * @return the right
	 */
	public BinaryNode getRight() {
		return right;
	}// end of method

	/**
	 * Sets the right.
	 *
	 * @param right the new right
	 */
	public void setRight(BinaryNode right) {
		this.right = right;
	}// end of method

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return value + "";
	}// end of method

}
