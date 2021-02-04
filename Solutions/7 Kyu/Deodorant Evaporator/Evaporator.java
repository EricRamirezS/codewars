public class Evaporator {

    public static int evaporator(double content, double evap_per_day, double threshold) {
        double threshold_ml = content * threshold / 100;
        int days = 0;
        while (content > threshold_ml) {
            content -= content * (evap_per_day / 100);
            days++;
        }
        return days;
    }
}