package Chapter2;
import java.util.Scanner;
public class LargestAndSmallestInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("Enter the third number: ");
        int c = input.nextInt();
        System.out.println("Enter the fourth number: ");
        int d = input.nextInt();
        System.out.println("Enter the fifth number: ");
        int e = input.nextInt();

        double result = large(a, b, c, d, e);
        System.out.println("Largest number is: " + result);

        double result2 = small(a, b, c, d, e);
        System.out.println("Smallest number is: " + result);
    }
    public static double large(double a, double b, double c,
                               double d, double e) {
double largestNumber = a;

if (b > largestNumber) {
    largestNumber = b;
}
if (c > largestNumber) {
    largestNumber = c;
}

if (d > largestNumber) {
    largestNumber = d;
}

if (e > largestNumber) {
    largestNumber = e;
}
return largestNumber;
    }
    public static double small(double a, double b, double c,
                               double d, double e) {

        double smallestNumber = a;

        if(b < smallestNumber) {
            smallestNumber = b;
        }
        if(c < smallestNumber) {
            smallestNumber = c;
        }
        if (d < smallestNumber) {
            smallestNumber = d;
        }
        if (e < smallestNumber) {
            smallestNumber = e;
        }
        return smallestNumber;
    }

    }

