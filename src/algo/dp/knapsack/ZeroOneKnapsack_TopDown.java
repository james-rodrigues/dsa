package algo.dp.knapsack;

/**
 * The Class ZeroOneKnapsack_TopDown.
 */
public class ZeroOneKnapsack_TopDown {

	/**
	 * Knapsack.
	 *
	 * @param profits  the profits
	 * @param weights  the weights
	 * @param capacity the capacity
	 * @return the int
	 */
	public int knapsack(int[] profits, int[] weights, int capacity) {
		Integer[][] dp = new Integer[profits.length][capacity + 1];
		return this.knapsackAux(dp, profits, weights, capacity, 0);
	}// end of method

	/**
	 * Knapsack aux.
	 *
	 * @param dp           the dp
	 * @param profits      the profits
	 * @param weights      the weights
	 * @param capacity     the capacity
	 * @param currentIndex the current index
	 * @return the int
	 */
	private int knapsackAux(Integer[][] dp, int[] profits, int[] weights, int capacity, int currentIndex) {
		if (capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length) // Base case
			return 0;

		if (dp[currentIndex][capacity] != null) // if we have already solved this problem, then return the result from
												// memory
			return dp[currentIndex][capacity];

		int profit1 = 0;
		if (weights[currentIndex] <= capacity) // Taking current element
			profit1 = profits[currentIndex]
					+ knapsackAux(dp, profits, weights, capacity - weights[currentIndex], currentIndex + 1);

		int profit2 = knapsackAux(dp, profits, weights, capacity, currentIndex + 1); // Not taking current element
		dp[currentIndex][capacity] = Math.max(profit1, profit2);
		return dp[currentIndex][capacity];
	}// end of method

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ZeroOneKnapsack_TopDown ks = new ZeroOneKnapsack_TopDown();
		int[] profits = { 31, 26, 72, 17 };
		int[] weights = { 3, 1, 5, 2 };
		int maxProfit = ks.knapsack(profits, weights, 7);
		System.out.println(maxProfit);
	}// end of method

}// end of class