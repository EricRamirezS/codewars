public class Kata {
	public static String longToIP(long ip) {
		return ((ip >> 24) & 0xff) + "." +
				((ip >> 16) & 0xff) + "." +
				((ip >> 8) & 0xff) + "." +
				(ip & 0xff);
	}
}
