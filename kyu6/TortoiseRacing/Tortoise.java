package codewarsSolutions.kyu6.TortoiseRacing;

/**
 * untitled
 * <p>
 * Created by Eric Ramírez Santis on 09-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
public class Tortoise {

	public static int[] race(int v1, int v2, int g) {
		if (v1 >= v2) return null;
		int t = (int) ((g / (double) (v2 - v1)) * 3600);
		return new int[]{t / 3600, (t / 60) % 60, t % 60};
	}

}
