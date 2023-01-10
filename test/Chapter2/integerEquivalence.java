package Chapter2;

import java.util.Scanner;

public class integerEquivalence {
    public static void main(String[] args) {
        Scanner samScanner = new Scanner(System.in);
        System.out.printf("The equivalence of the character %c is: %d%n", 'a', ((int)'a'));
        System.out.printf("The equivalence of the character %c is: %d%n", 'A', ((int)'A'));
        System.out.printf("The equivalence of the character %c is: %d%n", 'B', ((int)'B'));
        System.out.printf("The equivalence of the character %c is: %d%n", 'C', ((int)'C'));
        System.out.printf("The equivalence of the character %c is: %d%n", 'b', ((int)'b'));
        System.out.printf("The equivalence of the character %c is: %d%n", 'c', ((int)'c'));
        System.out.printf("The equivalence of the character %c is: %d%n", '0', ((int)'0'));
        System.out.printf("The equivalence of the character %c is: %d%n", '1', ((int)'1'));
        System.out.printf("The equivalence of the character %c is: %d%n", '2', ((int)'2'));
        System.out.printf("The equivalence of the character %c is: %d%n", '$', ((int)'$'));
        System.out.printf("The equivalence of the character %c is: %d%n", '*', ((int)'*'));
        System.out.printf("The equivalence of the character %c is: %d%n", '+', ((int)'+'));
        System.out.printf("The equivalence of the character %c is: %d%n", '/', ((int)'/'));
        System.out.printf("The equivalence of the character %c is: %d%n", ' ', ((int)' '));

        System.out.println("Enter a group of five digits in an integer to be separated:  ");
        int intDigit = samScanner.nextInt();
        int firstNumber = (intDigit /10000) % 10;
        int secondNumber = (intDigit / 1000) % 10;
        int thirdNumber = (intDigit / 100) % 10;
        int fourthNumber = (intDigit / 10) % 10;
        int fifthNumber = (intDigit) % 10;

        System.out.printf("The number with three spaces in between is: %-3d%-3d%-3d%-3d%-3d", firstNumber, secondNumber, thirdNumber,
                fourthNumber, fifthNumber);
    }

}
