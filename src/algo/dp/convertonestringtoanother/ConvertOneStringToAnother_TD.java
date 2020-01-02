package algo.dp.convertonestringtoanother;

/**
 * The Class ConvertOneStringToAnother_TD.
 */
public class ConvertOneStringToAnother_TD {

	/**
	 * Find min operations.
	 *
	 * @param s1 the s 1
	 * @param s2 the s 2
	 * @return the int
	 */
	public int findMinOperations(String s1, String s2) {
		Integer[][] dp = new Integer[s1.length() + 1][s2.length() + 1];
		return findMinOperationsRecursive(dp, s1, s2, 0, 0);
	}// end of method

	/**
	 * Find min operations recursive.
	 *
	 * @param dp the dp
	 * @param s1 the s 1
	 * @param s2 the s 2
	 * @param i1 the i 1
	 * @param i2 the i 2
	 * @return the int
	 */
	private int findMinOperationsRecursive(Integer[][] dp, String s1, String s2, int i1, int i2) {
		if (dp[i1][i2] == null) {
			if (i1 == s1.length()) // if we have reached the end of s1, then insert all the remaining characters of
									// s2
				dp[i1][i2] = s2.length() - i2;

			else if (i2 == s2.length()) // if we have reached the end of s2, then delete all the remaining characters of
										// s1
				dp[i1][i2] = s1.length() - i1;

			else if (s1.charAt(i1) == s2.charAt(i2)) // If the strings have a matching character, recursively match for
														// the remaining lengths.
				dp[i1][i2] = findMinOperationsRecursive(dp, s1, s2, i1 + 1, i2 + 1);

			else {
				int c1 = findMinOperationsRecursive(dp, s1, s2, i1 + 1, i2); // delete
				int c2 = findMinOperationsRecursive(dp, s1, s2, i1, i2 + 1); // insert
				int c3 = findMinOperationsRecursive(dp, s1, s2, i1 + 1, i2 + 1); // replace
				dp[i1][i2] = 1 + Math.min(c1, Math.min(c2, c3));
			}
		} // end of if-else
		return dp[i1][i2];
	}// end of method

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ConvertOneStringToAnother_TD editDisatnce = new ConvertOneStringToAnother_TD();
		System.out.println(editDisatnce.findMinOperations("table", "tbres"));
	}// end of method

}// end of class