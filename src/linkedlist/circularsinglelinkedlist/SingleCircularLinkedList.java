package linkedlist.circularsinglelinkedlist;

import node.SingleNode;

/**
 * The Class SingleCircularLinkedList.
 *
 * @param <T> the generic type
 */
public class SingleCircularLinkedList<T> {

	/** The head. */
	private SingleNode<T> head;

	/** The tail. */
	private SingleNode<T> tail;

	/** The size. */
	private int size;// denotes size of list

	/**
	 * Creates the single linked list.
	 *
	 * @param nodeValue the node value
	 * @return the single node
	 */
	SingleNode<T> createSingleLinkedList(T nodeValue) {
		head = new SingleNode<T>();
		SingleNode<T> node = new SingleNode<T>();
		node.setValue(nodeValue);
		node.setNext(node);
		head = node;
		tail = node;
		size = 1;// size =1
		return head;
	}

	/**
	 * Gets the head.
	 *
	 * @return the head
	 */
	public SingleNode<T> getHead() {
		return head;
	}

	/**
	 * Sets the head.
	 *
	 * @param head the new head
	 */
	public void setHead(SingleNode<T> head) {
		this.head = head;
	}

	/**
	 * Gets the tail.
	 *
	 * @return the tail
	 */
	public SingleNode<T> getTail() {
		return tail;
	}

	/**
	 * Sets the tail.
	 *
	 * @param tail the new tail
	 */
	public void setTail(SingleNode<T> tail) {
		this.tail = tail;
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Sets the size.
	 *
	 * @param size the new size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Insert in linked list.
	 *
	 * @param nodeValue the node value
	 * @param location  the location
	 */
	void insertInLinkedList(T nodeValue, int location) {
		SingleNode<T> node = new SingleNode<T>();
		node.setValue(nodeValue);
		System.out.println("Inserting new node at location: " + location);
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");
			return; // Linked List does not exists
		} else if (location == 0) {// insert at first position
			node.setNext(head);
			head = node;
			tail.setNext(node); // update tail
		} else if (location >= size) {// insert at last position
			tail.setNext(node);
			tail = node; // to keep track of last node
			tail.setNext(head); // update tail to circularly point head
		} else // insert at specified location
		{
			SingleNode<T> tempNode = head;
			int index = 0;
			while (index < location - 1) {// loop till we reach specified node
				tempNode = tempNode.getNext();
				index++;
			} // insert new node after tempNode
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
		}
		size++;
	}

	/**
	 * Exists linked list.
	 *
	 * @return true, if successful
	 */
	public boolean existsLinkedList() {
		// if head is not null retrun true otherwise return false
		return head != null;
	}

	/**
	 * Traverse linked list.
	 */
	// Traverse Linked List
	void traverseLinkedList() {
		if (existsLinkedList()) {
			SingleNode tempNode = head;
			for (int i = 0; i < size; i++) {

				System.out.print(tempNode.getValue());
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}
			System.out.println("\n");
		} else {
			System.out.println("\nLinked List does not exists !");
		}
	}

	/**
	 * Prints the head using tail.
	 */
	// Traverse Linked List
	void printHeadUsingTail() {
		if (existsLinkedList()) {
			System.out.println("Printing Tail...");
			System.out.println(tail.getValue());

			System.out.println("Printing Head using Head reference...");
			System.out.println(head.getValue());

			System.out.println("Printing Head using Tail reference...");
			System.out.println(tail.getNext().getValue());

		} else {
			System.out.println("Linked List does not exists");
		}
	}

	/**
	 * Delete linked list.
	 */
	// Delete linked list
	void deleteLinkedList() {
		System.out.println("\n\nDeleting Linked List...");
		head = null;
		if (tail == null) {
			System.out.println("Linked List is already deleted, nothing to delete !");
			return;
		} else {
			tail.setNext(null);
			tail = null;
			System.out.println("Linked List deleted successfully !");
		}
	}

	/**
	 * Search node.
	 *
	 * @param nodeValue the node value
	 * @return true, if successful
	 */
	// Search given value in Linked List
	boolean searchNode(T nodeValue) {
		if (existsLinkedList()) {
			SingleNode<T> tempNode = head;
			for (int i = 0; i < size; i++) {

				// System.out.print(tempNode.value);
				if (tempNode.getValue() == nodeValue) {
					System.out.print("Found the node at location: " + i);
					return true;
				}
				tempNode = tempNode.getNext();
			}
		}
		System.out.print("Node not found!! ");

		return false;
	}

	/**
	 * Deletion of node.
	 *
	 * @param location the location
	 */
	public void deletionOfNode(int location) {
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");// Linked List does not exists
			return;
		} else if (location == 0) { // we want to delete first element
			head = head.getNext();
			tail.setNext(head);
			setSize(getSize() - 1);
			if (getSize() == 0) { // if there are no more nodes in this list
				tail = null;
			}
		} else if (location >= getSize()) { // If location is not in range or equal, then delete last node
			SingleNode<T> tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.getNext(); // temp node points to 2nd last node
			}
			if (tempNode == head) { // if this is the only element in the list
				tail = head = null;
				setSize(getSize() - 1);
				return;
			}
			tempNode.setNext(head);
			tail = tempNode;
			setSize(getSize() - 1);

		} else { // if any inside node is to be deleted
			SingleNode<T> tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.getNext(); // we need to traverse till we find the location
			}
			tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
			setSize(getSize() - 1);
		} // end of else

	}// end of method

}// end of class
