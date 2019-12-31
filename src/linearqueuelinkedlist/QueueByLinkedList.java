package linearqueuelinkedlist;

import linkedlist.singlelinkedlist.SingleLinkedList;

/**
 * The Class QueueByLinkedList.
 *
 * @param <T> the generic type
 */
public class QueueByLinkedList<T> {

	/** The list. */
	SingleLinkedList<T> list;

	/**
	 * Instantiates a new queue by linked list.
	 */
	// constructor
	public QueueByLinkedList() {
		list = new SingleLinkedList<T>();
	}// end of method

	/**
	 * En queue.
	 *
	 * @param value the value
	 */
	public void enQueue(T value) {
		if (list.getHead() == null) {
			list.createSingleLinkedList(value);
		} else {
			// push a value on last of queue, update list tail too
			list.insertInLinkedList(value, list.getSize());
		}
	}// end of method

	/**
	 * De queue.
	 *
	 * @return the int
	 */
	public T deQueue() {
		T value = null;
		if (isQueueEmpty()) {
			System.out.println("Queue underflow error!!");
		} else {
			value = (T) list.getHead().getValue();
			list.deletionOfNode(0);
		}
		return value;
	}// end of method

	/**
	 * Peek.
	 *
	 * @return the int
	 */
	public T peek() {
		if (!isQueueEmpty())
			return (T) list.getHead().getValue();
		else {
			System.out.println("The queue is empty!!");
			return null;
		}
	}// end of method

	/**
	 * Checks if is queue empty.
	 *
	 * @return true, if is queue empty
	 */
	public boolean isQueueEmpty() {
		if (list.getHead() == null)
			return true;
		else
			return false;
	}// end of method

	/**
	 * Delete stack.
	 */
	public void deleteStack() {
		list.setHead(null);
	}// end of method

}// end of class
