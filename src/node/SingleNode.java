package node;

/**
 * The Class SingleNode.
 */
public  class SingleNode<T> {
	
	/** The value. */
	private T value;
	
	/** The next. */
	private SingleNode next;
	
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
	public SingleNode getNext() {
		return next;
	}

	/**
	 * Sets the next.
	 *
	 * @param next the new next
	 */
	public void setNext(SingleNode next) {
		this.next = next;
	}

/**
 * To string.
 *
 * @return the string
 */
@Override
public String toString() {
	return  value + "";
}

}
