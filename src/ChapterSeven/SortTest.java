package ChapterSeven;

import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.println("The list is " + (isSorted(numbers) ?
                "already " : "not ") + "sorted");
        if (!isSorted(numbers)) {
            bubbleSort(numbers);
            System.out.println("The list should have been: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isSorted(int[] numbers){
        boolean sorted = false;
        for(int index = 0; index < numbers.length - 1; index++){
            if(numbers[index] > numbers[index + 1]){
                sorted = false;
            }
            else{
                sorted = true;
            }
        }
        return  sorted;
    }

    public static void bubbleSort(int[] numbers) {
        boolean swapped;
        int temporalNumber;
        do {
            swapped = false;
            for (int index = 0; index < numbers.length - 1; index++) {
                if (numbers[index] > numbers[index + 1]) {
                    temporalNumber = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temporalNumber;
                    swapped = true;
                }
            }
        }
        while (swapped);
    }
}
