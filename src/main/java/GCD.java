import java.time.Duration;
import java.time.Instant;

public class GCD {

    public static int gcd(int p, int q){
        if(q == 0){
            return p;
        }
        return gcd(q, p % q);
    }

    public static int gcdLoop(int p, int q){
        boolean flag = false;
        int testP = p;
        int testQ = q;
        int outcome = -1;

        while(!flag){
            if(testQ == 0){
                outcome = testP;
                flag = true;
            }else{
                int temp = testQ;
                testQ = testP % testQ;
                testP = temp;
            }
        }

        return outcome;
    }

    public static long gcdTime(int p, int q){
        Instant start = Instant.now();
        gcd(p, q);
// CODE to be timed goes HERE
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();

        return timeElapsed;
    }

    public static long gcdLoopTime(int p, int q){
        Instant start = Instant.now();
        gcdLoop(p, q);
// CODE to be timed goes HERE
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        return timeElapsed;
    }
}
