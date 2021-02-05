import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {

    public int solution(int number) {
        SortedSet<Integer> set = new TreeSet<>();
        set.add(0);
        int i = 1, j = 1;
        do {
            int newValue;

            if (i * 3 > j * 5) newValue = j++ * 5;
            else newValue = i++ * 3;

            if (newValue < number) set.add(newValue);
            else break;

        } while (set.last() < number);
        return set.stream().mapToInt(Integer::intValue).sum();
    }
}