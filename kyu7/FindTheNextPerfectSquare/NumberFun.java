public class NumberFun {
	public static long findNextSquare(long sq) {
		double sqrt = Math.sqrt(sq);
		return (sqrt == (long) sqrt) ? (long) Math.pow(sqrt + 1, 2) : -1;
	}
}
