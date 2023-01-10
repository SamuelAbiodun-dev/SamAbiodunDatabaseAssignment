package Chapter3;

import java.util.Scanner;

public class NonIncreasingOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integer numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int temp;
        if(number2 > number1 || number3 > number1){
            if(number2 > number1){
                temp = number2;
                number2 = number1;
                number1 = temp;

            if(number3 > number1){
                temp = number3;
                number3 = number1;
                number1 = temp;
            }
            }
            if(number3 > number2){
                temp = number3;
                number3 = number2;
                number2 = temp;
            }
            System.out.println(number1 + " " + number2 + " " + number3 + " ");
        }
    }
}
