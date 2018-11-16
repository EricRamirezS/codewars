public class Kata {
	public static int betweenExtremes(int[] numbers) {
		java.util.List<Integer> list = java.util.Arrays.stream(numbers).boxed().collect(java.util.stream.Collectors.toList());
		return java.util.Collections.max(list) - java.util.Collections.min(list);
	}
}