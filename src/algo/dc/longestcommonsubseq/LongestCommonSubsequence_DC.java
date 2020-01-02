package algo.dc.longestcommonsubseq;

/**
 * The Class LongestCommonSubsequence_DC.
 */
public class LongestCommonSubsequence_DC {

	/**
	 * Find LCS length.
	 *
	 * @param s1 the s 1
	 * @param s2 the s 2
	 * @return the int
	 */
	public int findLCSLength(String s1, String s2) {
		return findLCSLengthAux(s1, s2, 0, 0);
	}// end of method

	/**
	 * Find LCS length aux.
	 *
	 * @param s1 the s 1
	 * @param s2 the s 2
	 * @param i1 the i 1
	 * @param i2 the i 2
	 * @return the int
	 */
	private int findLCSLengthAux(String s1, String s2, int i1, int i2) {
		if (i1 == s1.length() || i2 == s2.length())// Base Case
			return 0;

		int c3 = 0;
		if (s1.charAt(i1) == s2.charAt(i2)) {// If current character in both the string matches, then increase the index
												// by 1 in both the strings.
			c3 = 1 + findLCSLengthAux(s1, s2, i1 + 1, i2 + 1);
		}

		int c1 = findLCSLengthAux(s1, s2, i1, i2 + 1);// Increase index of 2nd String
		int c2 = findLCSLengthAux(s1, s2, i1 + 1, i2);// Increase index of 1st String

		return Math.max(c3, Math.max(c1, c2));
	}// end of method

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		LongestCommonSubsequence_DC lcs = new LongestCommonSubsequence_DC();
		System.out.println(lcs.findLCSLength("houdini", "hdupti"));
	}// end of method

}// end of class