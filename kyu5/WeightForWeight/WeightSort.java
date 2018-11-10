import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeightSort {

	public static String orderWeight(String strng) {
		List<String> strings = new ArrayList<>(Arrays.asList(strng.split(" ")));
		List<Integer> list = new ArrayList<>();
		for (String str : strings
		) {
			list.add(sumdigits(str));
		}
		ArrayList<String> orderedStringList = new ArrayList<>();
		while (strings.size() > 0) {
			int min = Integer.MAX_VALUE;
			int index = 0;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) < min) {
					min = list.get(i);
					index = i;
				}
			}
			orderedStringList.add(strings.get(index));
			list.remove(index);
			strings.remove(index);
		}
		StringBuilder orderedString = new StringBuilder();
		List<String> toSort = new ArrayList<>();
		for (String str : orderedStringList) {
			if (toSort.size() == 0) toSort.add(str);
			else if (sumdigits(toSort.get(0)) == sumdigits(str)) {
				toSort.add(str);
			} else {
				for (String stri : sortString(toSort)) {
					orderedString.append(stri).append(" ");
				}
				toSort.clear();
				toSort.add(str);
			}
		}
		for (String stri : sortString(toSort)
		) {
			orderedString.append(stri).append(" ");
		}
		return orderedString.toString().trim();

	}

	static int sumdigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += Character.getNumericValue(str.charAt(i));
		}
		return sum;
	}

	private static String[] sortString(List<String> list) {
		String temp;
		String[] x = new String[list.size()];
		x = list.toArray(x);
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i].compareTo(x[j]) > 0) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		return x;
	}
}
