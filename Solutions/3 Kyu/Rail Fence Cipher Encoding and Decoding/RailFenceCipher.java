import java.util.ArrayList;

public class RailFenceCipher {

    static String encode(String s, int n) {
        String[] rails = new String[n];
        for(int i = 0 ; i < n ; i++){
            rails[i] = "";
        }
        int i = 0;
        while(i < s.length()){
            for(int j = 0; j < n; j++){
                if ( i >= s.length()) break;
                rails[j] += s.charAt(i++);
            }
            for(int j = n-2; j > 0; j--){
                if ( i >= s.length()) break;
                rails[j] += s.charAt(i++);
            }
        }
        return String.join("", rails);
    }

    static String decode(String s, int n) {
        int lowerTail = (n - 1) * 2;
        int upperTail = 0;
        int textLength = s.length();
        ArrayList<String> decoded = new ArrayList<>();
        for (int i = 0; i < textLength; i++) {
            decoded.add("");
        }
        for (int i = 0; i < textLength; ) {
            boolean downDirection = lowerTail > 0;
            for (int j = decoded.indexOf(""); j < textLength; ) {
                decoded.set(j, s.charAt(i++) + "");
                if (downDirection) {
                    j += lowerTail;
                    if (upperTail > 0) {
                        downDirection = false;
                    }
                } else {
                    j += upperTail;
                    if (lowerTail > 0) {
                        downDirection = true;
                    }
                }
            }
            lowerTail -= 2;
            upperTail += 2;
        }
        return String.join("", decoded);
    }
}