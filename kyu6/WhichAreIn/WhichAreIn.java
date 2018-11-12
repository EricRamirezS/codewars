public class WhichAreIn {

	public static String[] inArray(String[] array1, String[] array2) {
		java.util.SortedSet<String> r = new java.util.TreeSet<>();
		for (String str : array1) {
			for (String substr : array2) {
				if (substr.contains(str)) {
					r.add(str);
					break;
				}
			}
		}
		return r.toArray(new String[r.size()]);
	}
}
