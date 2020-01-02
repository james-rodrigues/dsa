package algo.dc.numberfactor;

/**
 * The Class Number_Factors_DC.
 */
public class Number_Factors_DC {

	/**
	 * Ways to get N.
	 *
	 * @param n the n
	 * @return the int
	 */
	public int waysToGetN(int n) {
		if ((n == 0) || (n == 1) || (n == 2)) // { }, {1}, {1,1}
			return 1; //
		if (n == 3)
			return 2; // {1,1,1}, {3}

		int subtract1 = waysToGetN(n - 1); // if we subtract 1, we will be left with 'n-1'
		int subtract3 = waysToGetN(n - 3); // if we subtract 3, we will be left with 'n-3'
		int subtract4 = waysToGetN(n - 4); // if we subtract 4, we will be left with 'n-4'

		return subtract1 + subtract3 + subtract4;
	}// End of method

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Number_Factors_DC en = new Number_Factors_DC();
		System.out.println(en.waysToGetN(4));
		System.out.println(en.waysToGetN(5));
		System.out.println(en.waysToGetN(6));
	}// End of method

}// End of Class
