import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HowManyNumbers {

	private static List<Long> numbers = new ArrayList<>();

	public static List<Long> findAll(final int sumDigits, final int numDigits) {
		if (sumDigits > numDigits * 9) return new ArrayList<>();
		if (sumDigits == numDigits * 9)
			return new ArrayList<>(Arrays.asList(1L, (long) Math.pow(10, numDigits) - 1, (long) Math.pow(10, numDigits) - 1));
		numbers.clear();
		sumDigits(numDigits, 1, 1, 0, sumDigits, 0);
		if (numbers.size() == 0) return new ArrayList<>();
		return new ArrayList<>(Arrays.asList((long) numbers.size(), numbers.get(0), numbers.get(numbers.size() - 1)));
	}

	private static void sumDigits(long numDigits, long i, long min, long currentSumDigits, long sumDigits, long currentDigits) {
		if (numDigits < i) return;
		if (numDigits == i) {
			for (long j = min; j < 10; j++) {
				if (currentSumDigits + j == sumDigits) numbers.add(currentDigits * 10 + j);
				if (currentSumDigits + j > sumDigits) return;
			}
		} else {
			for (long j = min; j < 10; j++) {
				if (currentSumDigits > sumDigits) return;
				sumDigits(numDigits, i + 1, j, currentSumDigits + j, sumDigits, currentDigits * 10 + j);
			}
		}
	}
}