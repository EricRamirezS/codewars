public class Xbonacci {

    public double[] xbonacci(double[] signature, int n) {
        double[] r = new double[n];
        int x = signature.length;
        for (int i = 0; i < n; i++) {
            if (i < x) r[i] = signature[i];
            else {
                double sum = 0;
                for (int j = i - x; j < i; j++) {
                    sum += r[j];
                }
                r[i] = sum;
            }
        }
        return r;
    }
}