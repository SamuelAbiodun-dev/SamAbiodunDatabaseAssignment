package ChapterSeven;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for(int index = 0; index < numbers.length; index++){
            numbers[index] = input.nextDouble();

            selectionSort(numbers);

            for(double element : numbers){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static void selectionSort(double[] list){
        for(int index = list.length - 1; index >= 0; index--){
            double currentMax = list[index];
            int currentMaxIndex = index;

            for(int index2 = index - 1; index2 >= 0; index2--) {
                if (currentMax < list[index2]) {
                    currentMax = list[index2];
                    currentMaxIndex = index2;
                }
            }
            if(currentMaxIndex != index){
                list[currentMaxIndex] = list[index];
                list[index] = currentMax;
            }
        }
    }
}
