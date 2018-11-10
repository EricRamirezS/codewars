public class Troll {
	public static String disemvowel(String str) {
		StringBuilder strWithoutVowels = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (!isVowel(str.charAt(i))) {
				strWithoutVowels.append(str.charAt(i));
			}
		}
		return strWithoutVowels.toString();
	}

	static boolean isVowel(char a) {
		return "aeiouAEIOU".indexOf(a) > -1;
	}
}