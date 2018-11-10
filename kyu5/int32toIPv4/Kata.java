package codewarsSolutions.kyu5.int32toIPv4;

/**
 * codewars
 * <p>
 * Created by Eric Ramírez Santis on 08-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
public class Kata {
	public static String longToIP(long ip) {
		return ((ip >> 24) & 0xff) + "." +
				((ip >> 16) & 0xff) + "." +
				((ip >> 8) & 0xff) + "." +
				(ip & 0xff);
	}
}
