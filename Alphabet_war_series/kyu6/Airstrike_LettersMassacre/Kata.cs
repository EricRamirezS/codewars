public class Kata {
	public static string AlphabetWar(string fight) {
		char[] chars = new char[fight.Length];
		for (int i = 0; i < fight.Length; i++) {
			if (fight[i] == '*') {
				chars[i] = '_';
				try { // May cause out of bound Exception
					chars[i - 1] = '_';
				} catch {}
				try {// May cause out of bound Exception
					chars[i + 1] = '_';
				} catch {}
			} else if (chars[i] != '_') {
				chars[i] = fight[i];
			}
		}
		int lSide = 0;
		int rSide = 0;
		for (int i = 0; i < fight.Length; i++) {
			switch(chars[i]){
				case 'w': lSide+=4;break;
				case 'p': lSide+=3;break;
				case 'b': lSide+=2;break;
				case 's': lSide++;break;
				case 'm': rSide+=4;break;
				case 'q': rSide+=3;break;
				case 'd': rSide+=2;break;
				case 'z': rSide++;break;
			}
		}
		if (lSide == rSide) return "Let's fight again!";
		return lSide > rSide ? "Left side wins!" : "Right side wins!";
	}
}