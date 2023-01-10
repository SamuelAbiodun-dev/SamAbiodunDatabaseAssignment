package Chapter4;

public class Factorial {
    public static long factorial(long number){
        long result = number;
        for(long i = number -1; i > 0; i--){
            result = result * i;
        }
        return result;
    }
    public static double factorialExponents(int exponent) {
        double result = 0;
        for(int i = 0; i <= exponent; i++){
            result +=(double) 1 / factorial2(i);
        }
        return result;
    }

    public static double factorialExponentsPower(int exponentPower){
        double result = 0;
        int counter = 0;
        for(int i = 0; i <= exponentPower; i++){
            result +=  Math.pow(exponentPower, counter) * 1 / (factorial2(i));
            counter++;
        }
        return result;
    }
    public static long factorial2(long number){
        long result = 1;
        for(long i = 1; i <= number; i++){
            result = result * i;
        }
        return result;
    }
}
