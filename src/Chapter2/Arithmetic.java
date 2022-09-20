package Chapter2;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();

        System.out.print("Enter the second number: ");
        int b = input.nextInt();

        System.out.print("Enter the third number: ");
        int c = input.nextInt();

        int sum = a + b + c;
        System.out.printf("The sum of the three numbers is: %d%n", sum);

        int average = (a + b + c) / 3;
        System.out.printf("The average of the three numbers is: %d%n", average);

        int product = a * b * c;
        System.out.printf("The product of the three numbers is: %d%n", product);

        int result = largestNumber(a, b, c);
        System.out.println("Largest number is: " + result);

        int result2 = smallestNumber(a, b, c);
        System.out.println("Smallest number is: " + result2);
        }

    private static int smallestNumber(int a, int b, int c) {

            int smallestNumber = a;

            if (b < smallestNumber) {
                smallestNumber = b;
            }

            if (c < smallestNumber) {
                smallestNumber = c;
            }
            return smallestNumber;
    }

    private static int largestNumber(int a, int b, int c) {
        int largestNumber = a;

        if (b > largestNumber) {
            largestNumber = b;
        }
        if (c > largestNumber) {
            largestNumber = c;
        }
        return largestNumber;
    }
}

