package codewarsSolutions.kyu7.ShortestWord; /**
 * codewars
 * <p>
 * Created by Eric Ramírez Santis on 09-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
import java.util.Arrays;

public class Kata {
	public static int findShort(String s) {
		String[] strings = s.split(" ");
		int[] sizes = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			sizes[i] = strings[i].length();
		}
		Arrays.sort(sizes);
		return sizes[0];
	}
}
