public class AlphabetWars {

	public static String woLoLoooooo(String battlefield) {
		int lSide = 0;
		int rSide = 0;
		for (int i = 0; i < battlefield.length(); i++) {
			boolean lwololo = false;
			boolean rwololo = false;
			try {
				if (battlefield.charAt(i - 1) == 't') lwololo = true;
				else if (battlefield.charAt(i - 1) == 'j') rwololo = true;
			} catch (Exception ignored) {}
			try {
				if (battlefield.charAt(i + 1) == 't') lwololo = true;
				else if (battlefield.charAt(i + 1) == 'j') rwololo = true;
			} catch (Exception ignored) {}
			switch(battlefield.charAt(i)){
				case 'w': if(rwololo && !lwololo)rSide+=4;else lSide+=4;break;
				case 'p': if(rwololo && !lwololo)rSide+=3;else lSide+=3;break;
				case 'b': if(rwololo && !lwololo)rSide+=2;else lSide+=2;break;
				case 's': if(rwololo && !lwololo)rSide++;else lSide++;break;
				case 'm': if(lwololo && !rwololo)lSide+=4;else rSide+=4;break;
				case 'q': if(lwololo && !rwololo)lSide+=3;else rSide+=3;break;
				case 'd': if(lwololo && !rwololo)lSide+=2;else rSide+=2;break;
				case 'z': if(lwololo && !rwololo)lSide++;else rSide++;
			}
		}
		if (lSide == rSide) return "Let's fight again!";
		return lSide > rSide ? "Left side wins!" : "Right side wins!";
	}
}