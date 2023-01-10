package ChapterSeven;

import java.util.Scanner;

public class distinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] distinctNumbers = new int[10];
        int num;
        int count = 0;

        System.out.print("Enter ten numbers: ");
        for(int index = 0; index < 10; index++){
            num = input.nextInt();
            if(isDiscount(distinctNumbers, num)){
                distinctNumbers[count] = num;
                count++;
            }
        }
        System.out.println("The number of distinct numbers is " +
               count);
        System.out.println("The distinct numbers are: ");
        for(int index = 0; index < distinctNumbers.length; index++){
            if(distinctNumbers[index] > 0){
                System.out.print(" " + distinctNumbers[index]);
            }
        }
        System.out.println();
    }

    private static boolean isDiscount(int[] distinctNumbers, int num) {
        for(int index = 0; index< distinctNumbers.length; index++){
            if(num == distinctNumbers[index]) {
                return false;
            }
        }
        return true;
    }

}
