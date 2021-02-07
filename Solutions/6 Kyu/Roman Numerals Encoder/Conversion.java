public class Conversion {

    public String solution(int n) {

        StringBuilder roman = new StringBuilder();

        for (int i = 0; n > 0; i++) {
            int digit = n % 10;
            StringBuilder currentDigit = new StringBuilder();

            RomanSymbols romanSymbols = RomanSymbols.ONES;
            if (i == 1) romanSymbols = RomanSymbols.TENS;
            else if (i == 2) romanSymbols = RomanSymbols.HUNDREDS;
            else if (i == 3) romanSymbols = RomanSymbols.THOUSAND;


            if (digit < 4) {
                for (; digit > 0; digit--) {
                    currentDigit.append(romanSymbols.inf);
                }
            } else if (digit == 4) {
                currentDigit = new StringBuilder(romanSymbols.inf + romanSymbols.mid);
            } else if (digit < 9) {
                currentDigit = new StringBuilder(romanSymbols.mid);
                for (; digit > 5; digit--) {
                    currentDigit.append(romanSymbols.inf);
                }
            } else if (digit == 9) {
                currentDigit = new StringBuilder(romanSymbols.inf + romanSymbols.sup);
            } else {
                currentDigit = new StringBuilder(romanSymbols.sup);
            }

            n /= 10;
            roman.insert(0, currentDigit.toString());
        }

        return roman.toString();
    }
}

enum RomanSymbols {

    ONES("I", "V", "X"),
    TENS("X", "L", "C"),
    HUNDREDS("C", "D", "M"),
    THOUSAND("M", "M", "M");

    String inf;
    String mid;
    String sup;

    RomanSymbols(String inf, String mid, String sup) {
        this.inf = inf;
        this.mid = mid;
        this.sup = sup;
    }
}