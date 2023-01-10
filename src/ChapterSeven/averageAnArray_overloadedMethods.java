package ChapterSeven;

import java.util.Scanner;

public class averageAnArray_overloadedMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = new double[10];

        System.out.println("Enter ten double numbers: ");

        for(int index = 0; index < values.length; index++){
            values[index] = input.nextDouble();
        }
        System.out.println("The average value of the numbers you entered is: " + average(values));

    }

    public static double average(double[] array) {
        double average = 0;
        for(double number : array){
            average += number;
        }
        return average / array.length;
    }

    public static int average(int[] array){
        int average = 0;
        for(int number : array){
            average += number;
        }
        return average / array.length;
    }
}
