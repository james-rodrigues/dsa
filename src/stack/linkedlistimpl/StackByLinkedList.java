package stack.linkedlistimpl;

import linkedlist.singlelinkedlist.SingleLinkedList;

/**
 * The Class StackByLinkedList.
 *
 * @param <T> the generic type
 */
public class StackByLinkedList<T> {

	/** The list. */
	SingleLinkedList<T> list;

	/**
	 * Instantiates a new stack by linked list.
	 */
	// constructor
	public StackByLinkedList() {
		list = new SingleLinkedList<T>();
	}// end of method

	/**
	 * Push.
	 *
	 * @param value the value
	 */
	public void push(T value) {
		if (list.getHead() == null) {
			list.createSingleLinkedList(value);
		} else {
			list.insertInLinkedList(value, 0);
		}
		System.out.println("Inserted " + value + " in Stack !");
	}// end of method

	/**
	 * Pop.
	 *
	 * @return the int
	 */
	public T pop() {
		T value = null;
		if (isEmpty()) {
			System.out.println("Stack underflow error!!");
		} else {
			value = (T) list.getHead().getValue();
			list.deletionOfNode(0);
		}
		return value;
	}// end of method

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		if (list.getHead() == null)
			return true;
		else
			return false;
	}// end of method

	/**
	 * Peek.
	 *
	 * @return the int
	 */
	public T peek() {
		if (!isEmpty())
			return (T) list.getHead().getValue();
		else {
			System.out.println("The stack is empty!!");
			return null;
		}
	}// end of method

	/**
	 * Delete stack.
	 */
	public void deleteStack() {
		list.setHead(null);
	}// end of method

}// end of method
