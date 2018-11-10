package codewarsSolutions.kyu6.YourOrderPlease;

/**
 * codewars
 * <p>
 * Created by Eric Ramírez Santis on 09-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
public class Order {
	public static String order(String words) {
		String[] unsortedWords = words.split(" ");
		String[] sortedWords = new String[unsortedWords.length];
		for (String word : unsortedWords) {
			for (int i = 0; i < word.length(); i++) {
				char character = word.charAt(i);
				if (Character.isDigit(character)) {
					sortedWords[Character.getNumericValue(character) - 1] = word;
					break;
				}
			}
		}
		StringBuilder sorted = new StringBuilder();
		for (String word :
				sortedWords) {
			sorted.append(word).append(" ");
		}
		return !sorted.toString().trim().equals("null") ?sorted.toString().trim():"";
	}
}
