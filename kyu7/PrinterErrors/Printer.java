package codewarsSolutions.kyu7.PrinterErrors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * untitled
 * <p>
 * Created by Eric Ramírez Santis on 09-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
public class Printer {

	public static String printerError(String s) {
		int count=0;
		Pattern pattern = Pattern.compile("[a-m]");
		Matcher matcher = pattern.matcher(s);

		while (matcher.find())count++;
		int colors = s.length();
		int errors = colors-count;
		return String.format("error_printer(s) =>\"%s/%s",errors,colors);
	}

}
