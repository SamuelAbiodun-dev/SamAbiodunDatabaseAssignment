package Chapter3;
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int numberOfFactors = 0;
        System.out.print("""
                Enter any number to check for a prime number test
                Here(-->):""");
        number = sc.nextInt();

        for(int i = 1; i <= number; i++){
            int remainder = number % i;

            if(remainder == 0){
                numberOfFactors++;
                System.out.printf("The factors of the prime numbers is: %d ",numberOfFactors);
            }
        }
        if(numberOfFactors > 2){
            System.out.printf(number + " is not a prime number!");
        }
        else
            System.out.println(number + " is a prime number");
    }
}
