package node;

/**
 * The Class DoubleNode.
 */
public class DoubleNode {

	/** The value. */
	private int value;

	/** The next. */
	private DoubleNode next;

	/** The prev. */
	private DoubleNode prev;

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
	 * Gets the next.
	 *
	 * @return the next
	 */
	public DoubleNode getNext() {
		return next;
	}

	/**
	 * Sets the next.
	 *
	 * @param next the new next
	 */
	public void setNext(DoubleNode next) {
		this.next = next;
	}

	/**
	 * Gets the prev.
	 *
	 * @return the prev
	 */
	public DoubleNode getPrev() {
		return prev;
	}

	/**
	 * Sets the prev.
	 *
	 * @param prev the new prev
	 */
	public void setPrev(DoubleNode prev) {
		this.prev = prev;
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
