package ChapterSeven;

import java.util.Scanner;

public class indexOfSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arrayOfNumbers = new double[10];
        System.out.println("Enter ten double numbers: ");
        for(int index = 0; index < arrayOfNumbers.length; index++){
            arrayOfNumbers[index] = input.nextDouble();
        }
        System.out.println("The minimum number is " +
                arrayOfNumbers[indexOfSmallestNumber(arrayOfNumbers)] + " of index " +
                indexOfSmallestNumber(arrayOfNumbers));
        }
    public static int indexOfSmallestNumber(double[] numbers) {
        if(numbers.length <= 1){
            return 0;
        }
        double minimumValue = numbers[0];
        int minimumIndex = 0;
        for(int index = 1; index < numbers.length; index++){
            if(numbers[index] < minimumValue){
                minimumValue = numbers[index];
                minimumIndex = index;
            }
        }
        return minimumIndex;
    }
    }

