public class Kata {

	public static String createPhoneNumber(int[] numbers) {
		return String.format("(%s%s%s) %s%s%s-%s%s%s%s", java.util.stream.IntStream.of(numbers).boxed().toArray(Integer[]::new));
	}
}
