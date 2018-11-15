public class Vowels {

	public static int getCount(String str) {
		int vowelsCount = 0;
		for (int i = 0; i < str.length(); i++)
			vowelsCount += "aeiou".indexOf(str.charAt(i)) > -1 ? 1 : 0;
		return vowelsCount;
	}

}