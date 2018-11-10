package codewarsSolutions.kyu6.TheSupermarketQueue;

/**
 * codewars
 * <p>
 * Created by Eric Ramírez Santis on 09-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
import java.util.stream.IntStream;

public class Solution {

	public static int solveSuperMarketQueue(int[] customers, int n) {
		if (n == 1) return IntStream.of(customers).sum();
		int[] leftTime = new int[n];
		int timeLapsed = 0;
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (index < customers.length)
				leftTime[i] = customers[index++];
			else leftTime[i] = 0;
		}
		while (IntStream.of(leftTime).sum() > 0 || index < customers.length) {
			for (int i = 0; i < n; i++) {
				leftTime[i] = leftTime[i] - 1 < 0 ? 0 : leftTime[i] - 1;
				if (leftTime[i] <= 0 && index < customers.length) leftTime[i] = customers[index++];
			}
			timeLapsed++;
		}
		return timeLapsed;
	}

}