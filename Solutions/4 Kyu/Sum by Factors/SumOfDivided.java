import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfDivided {
	public static String sumOfDivided(int[] l) {
		List<String> list = new ArrayList<>();
		int[] intsAbs = new int[l.length];
		for (int i = 0; i < l.length; i++) {
			intsAbs[i] = Math.abs(l[i]);
		}
		Arrays.sort(intsAbs);
		for (int i = 2; i <= intsAbs[l.length - 1]; i++) {
			int sum = 0;
			boolean add = false;
			if (!isPrime(i)) continue;
			for (int val : l) {
				if (val % i == 0) {
					sum += val;
					add = true;
				}
			}
			if (add) list.add(i + " " + sum);
		}
		return "(" + String.join(")(", list) + ")";
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

