package ChapterSeven;

import java.util.Scanner;

public class MaxAndMin2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int invalidCounter = -1;
        double max = 0.0;
        double min = 0.0;
        while(counter <= 3){
            System.out.printf("Enter number %d: ", counter);
            double number = input.nextDouble();
            if (number >= 0.0 && number <= 100.0){
                System.out.println("Good input, ride on!");
            }
            if(number < 0.0 || number > 100.0){
                System.out.printf("The invalid number entered is: %.2f%n", number);
                System.out.println("Enter a number between 0 to 100");
                invalidCounter++;
                continue;
            }
            if (counter == 1){
                min = number;
                max = number;
            }
            if (counter > 1){
                if (number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            }
            counter++;
        }
        invalidCounter++;
        System.out.printf("The maximum number is: %.2f", max);
        System.out.printf("%nThe minimum number is: %.2f", min);
        System.out.printf("%nThe number of invalid input is: %d", invalidCounter);
    }
}
