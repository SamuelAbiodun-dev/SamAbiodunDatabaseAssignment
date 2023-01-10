package ChapterSeven;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for(int index = 0; index < numbers.length; index ++){
            numbers[index] = input.nextDouble();
        }
        bubbleSort(numbers);

        for(double number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(double[] array){
        double temporalNumber;
        boolean swappedNumber;

        do{
            swappedNumber = false;
            for(int index = 0; index < array.length - 1; index++){
                if(array[index] > array[index + 1]){
                    temporalNumber = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temporalNumber;
                    swappedNumber = true;
                }
            }
        }
        while(swappedNumber);
    }
}
