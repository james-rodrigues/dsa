package sorting;

/**
 * The Class SelectionSort.
 */
public class SelectionSort {

	/**
	 * Selection sort.
	 *
	 * @param a the a
	 */
	static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int minimumIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minimumIndex]) // find which is the smallest element to right of 'i'
					minimumIndex = j;
			} // end of inner loop
			if (minimumIndex != i) { // if i is not minimum index then swap
				int temp = a[i];
				a[i] = a[minimumIndex];
				a[minimumIndex] = temp;
			}
		} // end of outer loop
	}// end of method

	/**
	 * Prints the array.
	 *
	 * @param array the array
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}// end of method

}// end of class
