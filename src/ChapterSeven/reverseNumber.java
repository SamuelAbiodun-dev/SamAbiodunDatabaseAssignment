package ChapterSeven;

import java.util.Scanner;

import static myPrintAndInput.printAndInput.input;

public class reverseNumber {
    public static void main(String[] args) {
       String lengthOfArray =  input("How many numbers do you want to enter? ");
       int[] arrayOfNumbers = new int[Integer.parseInt(lengthOfArray)];
        System.out.print("Enter the numbers: ");
       fillUpArray(arrayOfNumbers);

       for (int index = arrayOfNumbers.length - 1; index >= 0; index--){
           System.out.print(arrayOfNumbers[index] + " ");
       }
    }
    public static void fillUpArray(int [] array){
        Scanner input = new Scanner(System.in);
        for (int index = 0; index < array.length; index++){
            array[index] = input.nextInt();
        }
    }
}
