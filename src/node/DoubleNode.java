package node;

/**
 * The Class DoubleNode.
 *
 * @param <T> the generic type
 */
public class DoubleNode<T> {

	/** The value. */
	private T value;

	/** The next. */
	private DoubleNode<T> next;

	/** The prev. */
	private DoubleNode<T> prev;

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * Gets the next.
	 *
	 * @return the next
	 */
	public DoubleNode<T> getNext() {
		return next;
	}

	/**
	 * Sets the next.
	 *
	 * @param next the new next
	 */
	public void setNext(DoubleNode<T> next) {
		this.next = next;
	}

	/**
	 * Gets the prev.
	 *
	 * @return the prev
	 */
	public DoubleNode<T> getPrev() {
		return prev;
	}

	/**
	 * Sets the prev.
	 *
	 * @param prev the new prev
	 */
	public void setPrev(DoubleNode<T> prev) {
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
