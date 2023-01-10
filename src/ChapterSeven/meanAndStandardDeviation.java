package ChapterSeven;

import java.util.Scanner;

public class meanAndStandardDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten double numbers to get their mean and standard deviation values: ");

        for(int index = 0; index < numbers.length; index++){
            numbers[index] = input.nextDouble();
        }
        System.out.println("The mean value is: " + mean(numbers));
        System.out.printf("The standard deviation value is: %.4f" , standardDeviation(numbers));
    }
    public static double mean(double[] numbers){
        double mean = 0.0;
        for(double number : numbers){
            mean += number;
        }
        return mean / numbers.length;
    }
    public static double standardDeviation(double[] numbers){
        double deviation = 0.0;
        double mean = mean(numbers);
        for(double number : numbers){
            deviation += Math.pow(number - mean, 2);
        }
        return Math.sqrt((deviation) / (numbers.length - 1));
    }
}
