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
}
