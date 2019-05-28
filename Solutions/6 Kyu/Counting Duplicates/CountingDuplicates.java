public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        int matches = 0;
        while (text.length() > 0) {
            int textLength = text.length();
            text = text.replace(text.charAt(0) + "", "");
            if (text.length() < textLength - 1) {
                matches++;
            }
        }
        return matches;
    }
}