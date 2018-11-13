public class PositionAverage {

	public static double posAverage(String s) {
		String[] strings = s.split(",");
		int matchs = 0;
		double of = 0;
		for (int i = 0; i < strings.length; i++)
			strings[i] = strings[i].trim();
		for (int i = 0; i < strings.length; i++) {
			for (int j = i + 1; j < strings.length; j++)
				for (int k = 0; k < strings[i].length(); k++) {
					matchs += (strings[i].charAt(k) == strings[j].charAt(k)) ? 1 : 0;
					of++;
				}
		}
		return matchs * 100 / of;
	}
}