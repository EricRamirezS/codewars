import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

public class FindOdd {
    public static int findIt(int[] a) {
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        while(list.size() > 0){
            int lengthMod = list.size() % 2;
            int checking = list.get(0);
            list.removeAll(Collections.singleton(checking));
            if(list.size() % 2 != lengthMod){
                return checking;
            }
        }
        return -1;
    }
}