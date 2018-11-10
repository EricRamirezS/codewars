import java.util.Arrays;

public class Solution {

	public static boolean check(Object[] a, Object x) {
		return Arrays.stream(a).anyMatch(x::equals);
	}
}
