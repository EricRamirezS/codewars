import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Dinglemouse {

	public static int[] sort(final int array[]) {
		List<NumerAsText> list = new ArrayList<>();
		for (int n : array) {
			list.add(new NumerAsText(n));
		}
		list.sort(Comparator.comparing(NumerAsText::getText));
		return Arrays.stream(list.toArray(new NumerAsText[0])).mapToInt(NumerAsText::getNumber).toArray();
	}
}

class NumerAsText {

	private static final String[] FIRST_19 = {"", " one", " two", " three",
			" four", " five", " six", " seven", " eight", " nine", " ten",
			" eleven", " twelve", " thirteen", " fourteen", " fifteen",
			" sixteen", " seventeen", " eighteen", " nineteen"};

	private static final String[] TEN_NAME = {"", " ten", " twenty",
			" thirty", " forty", " fifty", " sixty", " seventy", " eighty",
			" ninety"};
	private final int number;
	private final String text;

	NumerAsText(int number) {
		this.number = number;
		if (number == 0) text = "zero";
		else {
			String ntext = "";
			if (number / 100 > 0) {
				ntext += FIRST_19[number / 100] + " hundred";
			}
			number %= 100;
			if (number <= 19) ntext += FIRST_19[number];
			else {
				ntext += TEN_NAME[number / 10];
				ntext += FIRST_19[number % 10];
			}
			text = ntext.trim();
		}
	}

	String getText() {
		return text;
	}

	int getNumber() {
		return number;
	}
}
