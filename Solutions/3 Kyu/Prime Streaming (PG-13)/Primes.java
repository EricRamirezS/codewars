import java.util.stream.IntStream;

public class Primes {

    private static int lastCheck = 3;

    public static IntStream stream() {
        lastCheck = 3;
        return IntStream.iterate(2, i -> isPrime());
    }


    private static int isPrime() {
        while (true) {
            boolean flag = true;
            if (lastCheck == 2 || lastCheck == 3) return lastCheck++;
            if (lastCheck % 2 == 0 || lastCheck % 3 == 0) {
                lastCheck++;
                continue;
            }
            long sqrtN = (long) Math.sqrt(lastCheck) + 1;
            for (long i = 6L; i <= sqrtN; i += 6) {
                if (lastCheck % (i - 1) == 0 || lastCheck % (i + 1) == 0) {
                    lastCheck += 2;
                    flag = false;
                    break;
                }
            }
            if (flag) return lastCheck++;
        }
    }
}