public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        double[] r = new double[n];
        for (int i = 0; i < n; i++) {
            if (i < 3) r[i] = s[i];
            else {
                r[i] = r[i - 1] + r[i - 2] + r[i - 3];
            }
        }
        return r;
    }
}