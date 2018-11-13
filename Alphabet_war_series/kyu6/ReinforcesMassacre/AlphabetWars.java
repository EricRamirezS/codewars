public class AlphabetWars {

	public static String reinforcesMassacre(String[] reinforces, String[] airStrikes) {
		char[] battlefield = new char[reinforces[0].length()];
		char[][] reinforcesChars = new char[reinforces.length][reinforces[0].length()];
		for (int i = 0; i < reinforces.length; i++) {
			for (int j = 0; j < reinforces[i].length(); j++) {
				reinforcesChars[i][j] = reinforces[i].charAt(j);
			}
		}
		for (int i = 0; i < battlefield.length; i++) {
			battlefield[i] = reinforces[0].charAt(i);
			reinforcesChars[0][i] = '_';
		}
		for (String airstrike : airStrikes) {
			for (int i = 0; i < airstrike.length(); i++) {
				if (airstrike.charAt(i) == '*') {
					battlefield[i] = '_';
					try { // May cause out of bound Exception
						battlefield[i - 1] = '_';
					} catch (Exception ignored) {
					}
					try {// May cause out of bound Exception
						battlefield[i + 1] = '_';
					} catch (Exception ignored) {
					}
				}
			}
			for (int i = 0; i < battlefield.length; i++) {
				if (battlefield[i] == '_') {
					boolean sreturn = false;
					for (char[] c : reinforcesChars) {
						for (int j = 0; j < c.length; j++) {
							if (c[i] != '_') {
								battlefield[i] = c[i];
								c[i] = '_';
								sreturn = true;
								break;
							}
						}
						if (sreturn) break;
					}
				}
			}
		}
		return new String(battlefield);
	}
}
