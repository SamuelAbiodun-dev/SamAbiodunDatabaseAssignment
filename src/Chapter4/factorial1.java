package Chapter4;

import java.util.Scanner;

public class factorial1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        for(int counter = number; counter >= 1; counter--){
            factorial = factorial * counter;
        }
        System.out.printf("%d! is: %d", number, factorial);

    }
}
