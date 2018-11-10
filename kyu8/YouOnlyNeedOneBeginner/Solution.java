package codewarsSolutions.kyu8.YouOnlyNeedOneBeginner;

import java.util.Arrays;

/**
 * codewars
 * <p>
 * Created by Eric Ramírez Santis on 08-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
public class Solution {

	public static boolean check(Object[] a, Object x) {
		return Arrays.stream(a).anyMatch(x::equals);
	}
}
