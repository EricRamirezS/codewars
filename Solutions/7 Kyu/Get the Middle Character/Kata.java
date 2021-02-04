class Kata {
    public static String getMiddle(String word) {
        int l = word.length();
        return word.substring((l-1) / 2, l/2 + 1);
    }
}