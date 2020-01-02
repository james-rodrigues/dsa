package algo.dc.knapsack;

/**
 * The Class ZeroOneKnapsack_DC.
 */
public class ZeroOneKnapsack_DC {

	/**
	 * Knapsack.
	 *
	 * @param profits  the profits
	 * @param weights  the weights
	 * @param capacity the capacity
	 * @return the int
	 */
	public int knapsack(int[] profits, int[] weights, int capacity) {
		return this.knapsackAux(profits, weights, capacity, 0);
	}// end of method

	/**
	 * Knapsack aux.
	 *
	 * @param profits      the profits
	 * @param weights      the weights
	 * @param capacity     the capacity
	 * @param currentIndex the current index
	 * @return the int
	 */
	private int knapsackAux(int[] profits, int[] weights, int capacity, int currentIndex) {
		if (capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length)// Base case
			return 0;

		int profit1 = 0;
		if (weights[currentIndex] <= capacity) // Taking current element
			profit1 = profits[currentIndex]
					+ knapsackAux(profits, weights, capacity - weights[currentIndex], currentIndex + 1);

		int profit2 = knapsackAux(profits, weights, capacity, currentIndex + 1); // Not taking current element
		return Math.max(profit1, profit2);
	}// end of method

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ZeroOneKnapsack_DC ks = new ZeroOneKnapsack_DC();
		int[] profits = { 31, 26, 72, 17 };
		int[] weights = { 3, 1, 5, 2 };
		int maxProfit = ks.knapsack(profits, weights, 7);
		System.out.println(maxProfit);
	}// end of method
}// end of class