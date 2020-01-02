package sorting;

/**
 * The Class QuickSort.
 */
public class QuickSort {

	/**
	 * Quick sort.
	 *
	 * @param array the array
	 * @param start the start
	 * @param end   the end
	 */
	public static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot - 1);
			quickSort(array, pivot + 1, end);
		}
	}// end of method

	/**
	 * Partition.
	 *
	 * @param array the array
	 * @param p     the p
	 * @param q     the q
	 * @return the int
	 */
	static int partition(int[] array, int p, int q) {
		int pivot = q;
		int i = p - 1;
		for (int j = p; j <= q; j++) {
			if (array[j] <= array[pivot]) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		return i;

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
