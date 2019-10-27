package linearqueuearray;

/**
 * The Class QueueByArray.
 */
public class QueueByArray{
	
	/** The arr. */
	int[] arr;
	
	/** The top of queue. */
	int topOfQueue;
	
	/** The beginning of queue. */
	int beginningOfQueue;

	
	/**
	 * Instantiates a new queue by array.
	 *
	 * @param size the size
	 */
	public QueueByArray(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginningOfQueue = -1;
		System.out.println("Successfully created an empty queue of size: "+size);
	}//end of method


	/**
	 * En queue.
	 *
	 * @param value the value
	 */
	public void enQueue(int value) {
		if (isQueueFull()) {
			System.out.println("Queue overflow error!!");
		}else if (isQueueEmpty()) { //If the queue is empty then we need to initialize beginning index 
			beginningOfQueue=0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted "+value+" in the queue");
		}else { //if the queue already has some elements in it then no need to initialize beginning index
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted "+value+" in the queue");
		}
		printQueue();
	}//end of method
	
		
	/**
	 * Prints the queue.
	 */
	public void printQueue() {
		if(!isQueueEmpty()) {
			System.out.println("Queue now ...");
			for(int i=beginningOfQueue; i<=topOfQueue; i++) {
				System.out.println(arr[i] + "   ");
			}
			System.out.println();
		}else {
			System.out.println("Queue is empty !");
		}
	}
	
	/**
	 * De queue.
	 */
	public void deQueue() {
		if (isQueueEmpty()) {
			System.out.println("Queue underflow error!!");
		} else {
			System.out.println("Dequeing value from Queue...");
			System.out.println("Dequeued: "+arr[beginningOfQueue]+" from queue");
			beginningOfQueue++;
			if(beginningOfQueue > topOfQueue) { //If last element in the Queue is Dequeued
				beginningOfQueue = topOfQueue = -1;
			}
		}
		printQueue();
		System.out.println();
	}//end of method

	
	/**
	 * Checks if is queue empty.
	 *
	 * @return true, if is queue empty
	 */
	public boolean isQueueEmpty() {
		if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length))
			return true;
		else
			return false;
	}//end of method

	
	/**
	 * Checks if is queue full.
	 *
	 * @return true, if is queue full
	 */
	public boolean isQueueFull() {
		if (topOfQueue == arr.length-1) {
			return true;
		}
		else {
			return false;
		}
			
	}//end of method

	
	/**
	 * Peek operation.
	 */
	public void peekOperation() {
		if (!isQueueEmpty()) {
			System.out.println(arr[beginningOfQueue]); 
		}else {
			System.out.println("The queue is empty!!");
		}
	}//end of method

	
	/**
	 * Delete queue.
	 */
	public void deleteQueue() {
		arr = null;
		System.out.println("Queue is successfully deleted !");
	}//end of method

}//end of class
