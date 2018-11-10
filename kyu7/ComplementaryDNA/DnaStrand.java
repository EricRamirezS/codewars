package codewarsSolutions.kyu7.ComplementaryDNA;

/**
 * untitled
 * <p>
 * Created by Eric Ramírez Santis on 09-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
public class DnaStrand {
	public static String makeComplement(String dna) {
		StringBuilder dnaComplement = new StringBuilder();
		for (int i = 0; i < dna.length(); i++) {
			dnaComplement.append(getComplement(dna.charAt(i)));
		}
		return dnaComplement.toString();
	}

	static char getComplement(char symbol) {
		if (symbol == 'A') return 'T';
		if (symbol == 'C') return 'G';
		if (symbol == 'G') return 'C';
		else return 'A';
	}
}