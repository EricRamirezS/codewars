import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardGame {
	static String[] sol(String[] p1, String[] p2, String[] p3, String[] c, String... d) {
		int p1p = cps(p1);
		int p2p = cps(p2);
		int p3p = cps(p3);
		int cp = cps(c);
		List<String> ch = new ArrayList<>(Arrays.asList(c));
		int i = 0;
		if (p1p <= 21 || p2p <= 21 || p3p <= 21) {
			while (cp < 17) {
				ch.add(d[i++]);
				cp = cps(ch.toArray(new String[0]));
			}
			List<String> w = new ArrayList<>();
			if (cp > 21) {
				if (p1p <= 21) w.add("Player 1");
				if (p2p <= 21) w.add("Player 2");
				if (p3p <= 21) w.add("Player 3");
			} else if (cp == 21 && ch.size() != 2) {
				if (p1p == 21 && p1.length == 2) w.add("Player 1");
				if (p2p == 21 && p2.length == 2) w.add("Player 2");
				if (p3p == 21 && p3.length == 2) w.add("Player 3");
			} else if (cp < 21) {
				if (p1p > cp && p1p <= 21) w.add("Player 1");
				if (p2p > cp && p2p <= 21) w.add("Player 2");
				if (p3p > cp && p3p <= 21) w.add("Player 3");
			}
			return w.toArray(new String[0]);
		}
		return new String[]{};
	}

	private static int cps(String[] c) {
		int p = 0;
		for (String s : c) {
			switch (s) {
				case "J":
					p += 10;
					break;
				case "Q":
					p += 10;
					break;
				case "K":
					p += 10;
					break;
				case "A":
					p += 11;
					break;
				default:
					p += Integer.parseInt(s);
			}
		}
		int i = 0;
		while (p > 21) {
			if (c[i++].equals("A")) p -= 10;
			if (c.length <= i) break;
		}
		return p;
	}
}
