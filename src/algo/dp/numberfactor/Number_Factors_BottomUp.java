package algo.dp.numberfactor;

/**
 * The Class Number_Factors_BottomUp.
 */
public class Number_Factors_BottomUp {

	/**
	 * Ways to get N.
	 *
	 * @param n the n
	 * @return the int
	 */
	public int waysToGetN(int n) {
		int dp[] = new int[n + 1];
		dp[0] = dp[1] = dp[2] = 1; // BaseCases
		dp[3] = 2; // BaseCases

		for (int i = 4; i <= n; i++)
			dp[i] = dp[i - 1] + dp[i - 3] + dp[i - 4];

		return dp[n];
	}// End of method

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Number_Factors_BottomUp en = new Number_Factors_BottomUp();
		System.out.println(en.waysToGetN(4));
		System.out.println(en.waysToGetN(5));
		System.out.println(en.waysToGetN(6));
	}// End of method

}// End of Class