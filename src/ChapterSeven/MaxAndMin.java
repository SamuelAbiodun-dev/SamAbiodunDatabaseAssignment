package ChapterSeven;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        double max = 0.0;
        double min = 0.0;
        while(count <= 5){
            System.out.printf("Enter number %d: ", count);
            double number = input.nextDouble();

            if(number < 0.0 || number > 100.0){
                System.out.println("Invalid input");
                continue;
            }
            if (count == 1){
                max = number;
                min = number;
            }
            if (count > 1){
                if (number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            }

            count++;

        }
        System.out.printf("Maximum number is: %.2f", max);
        System.out.printf("%nMinimum number is: %.2f", min);
    }
}
