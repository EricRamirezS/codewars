package codewarsSolutions.kyu6.AdisguisedsequenceI;

/**
 * codewars
 * <p>
 * Created by Eric Ramírez Santis on 08-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
import java.math.BigInteger;

class HiddenSeq {
	public static BigInteger fcn(int n) {
		return BigInteger.valueOf(1).shiftLeft(n);
	}
}

/*
package codewarsSolutions.kyu6.AdisguisedsequenceI;

import java.math.BigInteger;

class HiddenSeq {
	public static BigInteger fcn(int n) {
		return BigInteger.valueOf(2).pow(n);
	}
}
 */