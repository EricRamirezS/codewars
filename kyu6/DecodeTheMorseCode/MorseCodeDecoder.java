package codewarsSolutions.kyu6.DecodeTheMorseCode;

/**
 * untitled
 * <p>
 * Created by Eric Ramírez Santis on 09-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
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