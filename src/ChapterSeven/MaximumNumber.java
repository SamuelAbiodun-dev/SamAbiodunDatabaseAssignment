package ChapterSeven;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("Enter the fourth number:");
        int fourthNumber = scanner.nextInt();
        System.out.println("Enter the fifth number: ");
        int fifthNumber = scanner.nextInt();

        int result = maximumValue(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        System.out.println("The Maximum number is: " + result);
        int result2 = minimumValue(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        System.out.println("The minimum number is: " + result2);
    }

    public static int maximumValue(int firstNum, int secondNum, int thirdNum, int fourthNum, int fifthNum) {
        int max = firstNum;
         if (secondNum > max) {
            max = secondNum;
        } if (thirdNum > max) {
           max = thirdNum;
        } if (fourthNum > max) {
           max = fourthNum;
        } if (fifthNum > max) {
            max = fifthNum;
        }
         return max;
    }
    public static int minimumValue(int firstNum, int secondNum, int thirdNum, int fourthNum, int fifthNum) {
        int min = firstNum;
        if (secondNum < min) {
            min = secondNum;
        } if (thirdNum < min) {
            min = thirdNum;
        } if (fourthNum < min) {
            min = fourthNum;
        } if (fifthNum < min) {
            min = fifthNum;
        }
        return min;
    }
}


