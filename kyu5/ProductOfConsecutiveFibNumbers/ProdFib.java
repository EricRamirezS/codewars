package codewarsSolutions.kyu5.ProductOfConsecutiveFibNumbers;

/**
 * untitled
 * <p>
 * Created by Eric Ramírez Santis on 09-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
public class ProdFib {

	public static long[] productFib(long prod) {
		return fibonacci(0L, 1L, prod);
	}

	static long[] fibonacci(long n, long m, long lookingFor) {
		long prod = n * m;
		if (lookingFor > prod) return fibonacci(m, m + n, lookingFor);
		return new long[]{n, m, lookingFor == prod ? 1 : 0};
	}
}
