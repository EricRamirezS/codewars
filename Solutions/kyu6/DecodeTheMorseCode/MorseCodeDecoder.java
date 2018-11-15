public class MorseCodeDecoder {
	public static String decode(String morseCode) {
		String[] morses = morseCode.split(" ");
		StringBuilder returnText = new StringBuilder();
		for (String morse :
				morses) {
			if (MorseCode.get(morse) == null){
				returnText.append(" ");
			} else {
				returnText.append(MorseCode.get(morse));
			}
		}
		return returnText.toString().replace("  ", " ").trim();
	}
}