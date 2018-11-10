public class BouncingBall {

	public static int bouncingBall(double h, double bounce, double window) {
		if (h <= 0 || bounce < 0 && window > h) return -1;
		return 1 + calculateBouncing(h * bounce, bounce, window);
	}

	static int calculateBouncing(double h, double bounce, double window) {
		if (window > h) return 0;
		return 2 + calculateBouncing(h * bounce, bounce, window);
	}
}