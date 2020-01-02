package sorting;

/**
 * The Class HeapSort.
 */
public class HeapSort {

	/** The arr. */
	int[] arr = null;

	/**
	 * Instantiates a new heap sort.
	 *
	 * @param arr the arr
	 */
	// Constructor
	public HeapSort(int[] arr) {
		this.arr = arr;
	}// end of method

	/**
	 * Sort.
	 */
	public void sort() {
		HeapByArray hba = new HeapByArray(arr.length); // We will reuse HeapByArray class to do sorting
		for (int i = 0; i < arr.length; i++) { // Insert in Heap
			hba.insertInHeap(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) { // Extract from Heap and insert sorted data in current Array
			arr[i] = hba.extractHeadOfHeap();
		}
	}// end of method

	/**
	 * Prints the array.
	 */
	public void printArray() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}// end of method

}// end of class