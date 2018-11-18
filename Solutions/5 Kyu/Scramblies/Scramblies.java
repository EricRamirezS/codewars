import java.util.List;
import java.util.stream.Collectors;

public class Scramblies {

	public static boolean scramble(String str1, String str2) {
		List<Character> chars1 = str1.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
		List<Character> chars2 = str2.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
		for (Character chara : chars2) {
			if (!chars1.remove(chara)) return false;
		}
		return true;
	}
}