package Chapter6;

import java.util.Scanner;

public class RoundingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double doubleNumber = scanner.nextDouble();
        double newValue = roundingNumbers(doubleNumber);
        System.out.printf("The new result is: %.2f", newValue);
    }
    public static double roundingNumbers(double value){
        return Math.floor(value + 0.5);
    }
}
