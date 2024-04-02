public class Factorial {

    public static int factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static int factorialLoop(int num){
        int outcome = 1;
        for(int i = num; i > 0; i--){
            outcome = outcome * i;
        }
        return outcome;
    }
}
