public class Solution {

	public static String lcs(String x, String y) {
		String longestSubString = "";
		for (int i = 0; i < y.length(); i++) {
			String tempSubStr = "";
			int lastIndex = 0;
			for (int j = i; j < y.length(); j++) {
				for (int k = lastIndex; k < x.length(); k++) {
					if (x.charAt(k) == y.charAt(j)) {
						tempSubStr += x.charAt(k);
						if (tempSubStr.length() > longestSubString.length()) longestSubString = tempSubStr;
						lastIndex = k+1;
						break;
					}
				}
			}
		}
		return longestSubString;
	}

}
