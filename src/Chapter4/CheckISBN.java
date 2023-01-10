package Chapter4;

import java.util.Scanner;

public class CheckISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of a ISBN: ");
        String isbn = input.nextLine();

        int digit1 = Integer.parseInt(isbn.substring(0, 1));
        int digit2 = Integer.parseInt(isbn.substring(1, 2));
        int digit3 = Integer.parseInt(isbn.substring(2, 3));
        int digit4 = Integer.parseInt(isbn.substring(3, 4));
        int digit5 = Integer.parseInt(isbn.substring(4, 5));
        int digit6 = Integer.parseInt(isbn.substring(5, 6));
        int digit7 = Integer.parseInt(isbn.substring(6, 7));
        int digit8 = Integer.parseInt(isbn.substring(7, 8));
        int digit9 = Integer.parseInt(isbn.substring(8, 9));
//
//        System.out.println(digit1);
//        System.out.println(digit2);
//        System.out.println(digit3);
//        System.out.println(digit4);
//        System.out.println(digit5);
//        System.out.println(digit6);
//        System.out.println(digit7);
//        System.out.println(digit8);
//        System.out.println(digit9);

        int digit10 = (digit1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5
                        + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;

        System.out.println("The ISBN-10 number is " + isbn + ((digit10 == 10) ? "X" : digit10));
    }
}
