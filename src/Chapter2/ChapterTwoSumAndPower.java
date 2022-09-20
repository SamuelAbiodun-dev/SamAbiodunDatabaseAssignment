package Chapter2;
import java.util.Scanner;
public class ChapterTwoSumAndPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        int squareOfSum = (number1 + number2) * (number1 + number2);
        int difference = number1 - number2;
        int squareOfDifference = (number1 - number2) * (number1 - number2);

        System.out.printf("The Sum of the two numbers is: %d%n%n", sum);
        System.out.printf("The square of the sum of the two numbers is: %d%n%n", squareOfSum);
        System.out.printf("The difference of the two numbers is: %d%n%n", difference);
        System.out.printf("The square of the difference of the two numbers is: %d%n%n", squareOfDifference);
    }
}
