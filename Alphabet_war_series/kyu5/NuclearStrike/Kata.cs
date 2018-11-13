using System.Text.RegularExpressions;

public class Kata {
	public static string AlphabetWar(string b) {
		bool ripOutside = Regex.Matches(b, "#").Count > 0;
		if (!ripOutside) return b.Replace("[", "").Replace("]", "");
		string[] areas = Regex.Split(b, @"\[|\]");
		string survivors = "";
		for (int i = 0; i < areas.Length; i++) {
			if (i % 2 == 1) {
				int bombCount = 0;
				try {bombCount += Regex.Matches(areas[i - 1], "#").Count;} catch {}
				try {bombCount += Regex.Matches(areas[i + 1], "#").Count;} catch {}
				if (bombCount < 2) survivors += areas[i];
			}
		}
		return survivors;
	}
}