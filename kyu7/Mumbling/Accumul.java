public class Accumul {

	public static String accum(String s) {
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			output += capitalize(new String(new char[i + 1]).replace("\0", s.charAt(i) + "")) + "-";
		}
		return output.substring(0, output.length() - 1);
	}

	private static String capitalize(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}
}