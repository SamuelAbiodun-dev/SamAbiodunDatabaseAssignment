package ChapterSeven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FrequencyOfNumbers {
    public static void main(String[] args) {

        int[] counts = new int[10];

            System.out.print("Enter the integers between 1 and 10: ");
            count((counts));

            for (int index = 0; index < counts.length; index++) {
                if (counts[index] > 0) {
                    System.out.println((index + 1) + " occurs " + counts[index] +
                            " time " + (counts[index] > 1 ? "s" : ""));
                }
            }
        }

        public static void count ( int[] frequency) {
            int num = 0;
            do {
                try {
                    Scanner input = new Scanner(System.in);
                    num = input.nextInt();
                    if (num >= 1 && num <= 100) {
                        frequency[num - 1]++;
                    }
                } catch (ArrayIndexOutOfBoundsException e){
                    System.err.printf("%nException: %s%n", e);
                    System.out.print("Array index out of bounds");
                }
                catch(InputMismatchException e){
                    System.out.printf("%nException: %s%n", e);
                    System.out.print("%nYou entered an illegal input, please only numbers 1 to 10 are allowed");

                }
            }
                while (num != 0);
            }

}
