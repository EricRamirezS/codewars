package codewarsSolutions.kyu6.SumOfDigitsDigitalRoot;

/**
 * untitled
 * <p>
 * Created by Eric Ramírez Santis on 09-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
public class DRoot {
	public static int digital_root(int n) {
		//preventing error from original n < 0
		n = Math.abs(n);
		int mod = 10;
		int sum = 0;
		while (n * 10 > mod) {
			int rest = n % mod;
			//Dividing by 10 to get a single-digit number,
			//since "rest" is an integer, decimals are truncated.
			while (rest > 10) rest /= 10;
			sum += rest;
			mod *= 10;
		}
		if (sum > 10) return digital_root(sum);
		return sum;
	}
}