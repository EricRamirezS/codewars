package codewarsSolutions.kyu6.ValidBraces;

/**
 * codewars
 * <p>
 * Created by Eric Ramírez Santis on 09-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
import java.util.ArrayList;

public class BraceChecker {

	public boolean isValid(String braces) {
		if (!isOpenBrace(braces.charAt(0))) return false;
		ArrayList<Character> bracesList = new ArrayList<>();
		for (int i = 0; i < braces.length(); i++) {
			char currentBrace = braces.charAt(i);
			if (isOpenBrace(currentBrace)) {
				bracesList.add(currentBrace);
			} else {
				if (bracesList.size() == 0) return false;
				if (bracesList.get(bracesList.size() - 1) == getOpenBrace(currentBrace)) {
					bracesList.remove(bracesList.size() - 1);
				} else return false;
			}
		}
		return bracesList.size() == 0;
	}

	private char getOpenBrace(char brace) {
		if (brace == '}') return '{';
		if (brace == ')') return '(';
		else return '[';
	}

	private boolean isOpenBrace(char brace) {
		return "({[".indexOf(brace) > -1;
	}
}