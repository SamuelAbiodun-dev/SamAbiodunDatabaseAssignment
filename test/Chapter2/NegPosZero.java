package Chapter2;

import java.util.Scanner;

public class NegPosZero {
    public static void main(String[] args) {
        Scanner samInput = new Scanner(System.in);
        int counter= 1;
        int negativeCounter = 0;
        int positiveCounter = 0;
        int sameCounter = 0;
        while (counter <= 5){
            System.out.printf("Enter number %d: ", counter);
            int number = samInput.nextInt();
            if(number < 0){
                negativeCounter++;
            }
            if(number > 0){
                positiveCounter++;
            }
            if(number == 0){
                sameCounter++;
            }
            counter++;
        }
        System.out.printf("The number of negative numbers is: %d%n", negativeCounter);
        System.out.printf("The number of positive numbers is: %d%n", positiveCounter);
        System.out.printf("The number of zero numbers is: %d%n", sameCounter);
    }
}
