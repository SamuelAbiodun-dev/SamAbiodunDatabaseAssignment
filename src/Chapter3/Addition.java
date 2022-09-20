package Chapter3;
import java.util.Scanner;
public class Addition{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = myScanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = myScanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = myScanner.nextInt();

        int sum = number1 + number2 + number3;

        System.out.printf("Sum is: %d%n", sum);


    }
}

