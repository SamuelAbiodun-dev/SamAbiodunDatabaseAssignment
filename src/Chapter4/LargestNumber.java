package Chapter4;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int number;
        int largestNum1 = 0;
        int largestNum2 = 0;
        int largestNum3 = 0;
        while (counter < 10) {
            System.out.printf("Enter number %d: ", counter+1);
            number = scanner.nextInt();
            if(number > largestNum1) {
                largestNum3 = largestNum2;
                largestNum2 = largestNum1;
                largestNum1 = number;
            }
            counter++;
        }
        System.out.printf("%nLargest number is %d", largestNum1);
        System.out.printf("%nSecond to the largest number is %d", largestNum2);
        System.out.printf("%nThird to the largest number is %d", largestNum3);
    }
}