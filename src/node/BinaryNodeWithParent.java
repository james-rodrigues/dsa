package node;

/**
 * The Class BinaryNodeWithParent.
 */
public class BinaryNodeWithParent {

	/** The value. */
	private int value;

	/** The parent. */
	private BinaryNodeWithParent parent;

	/** The left. */
	private BinaryNodeWithParent left;

	/** The right. */
	private BinaryNodeWithParent right;

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Gets the parent.
	 *
	 * @return the parent
	 */
	public BinaryNodeWithParent getParent() {
		return parent;
	}

	/**
	 * Sets the parent.
	 *
	 * @param parent the new parent
	 */
	public void setParent(BinaryNodeWithParent parent) {
		this.parent = parent;
	}

	/**
	 * Gets the left.
	 *
	 * @return the left
	 */
	public BinaryNodeWithParent getLeft() {
		return left;
	}

	/**
	 * Sets the left.
	 *
	 * @param left the new left
	 */
	public void setLeft(BinaryNodeWithParent left) {
		this.left = left;
	}

	/**
	 * Gets the right.
	 *
	 * @return the right
	 */
	public BinaryNodeWithParent getRight() {
		return right;
	}

	/**
	 * Sets the right.
	 *
	 * @param right the new right
	 */
	public void setRight(BinaryNodeWithParent right) {
		this.right = right;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return value + "";
	}

}
