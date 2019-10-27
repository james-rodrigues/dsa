package stacklinkedlist;

import singlelinkedlist.SingleLinkedList;

/**
 * The Class StackByLinkedList.
 */
public class StackByLinkedList {

	/** The list. */
	SingleLinkedList list;

	
	/**
	 * Instantiates a new stack by linked list.
	 */
	//constructor
	public  StackByLinkedList() {
		list = new SingleLinkedList();
	}//end of method

	
	/**
	 * Push.
	 *
	 * @param value the value
	 */
	public void push(int value) {
		if(list.getHead()== null) {
			list.createSingleLinkedList(value);
		}else {
			list.insertInLinkedList(value, 0);	
		}
		System.out.println("Inserted " + value + " in Stack !");
	}//end of method

	
	/**
	 * Pop.
	 *
	 * @return the int
	 */
	public int pop() {
		int value = -1;
		if (isEmpty()) {
			System.out.println("Stack underflow error!!");
		} else {
			value = list.getHead().getValue();
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
	public int peek() {
		if (!isEmpty())
			return list.getHead().getValue();
		else {
			System.out.println("The stack is empty!!");
			return -1;
		}
	}// end of method
	

	/**
	 * Delete stack.
	 */
	public void deleteStack() {
		list.setHead(null);
	}//end of method
	
}//end of method
