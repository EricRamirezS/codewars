import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
