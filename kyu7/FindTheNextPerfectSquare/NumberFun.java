package codewarsSolutions.kyu7.FindTheNextPerfectSquare;

/**
 * codewars
 * <p>
 * Created by Eric Ramírez Santis on 09-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
public class NumberFun {
	public static long findNextSquare(long sq) {
		double sqrt = Math.sqrt(sq);
		return (sqrt == (long) sqrt) ? (long) Math.pow(sqrt + 1, 2) : -1;
	}
}
