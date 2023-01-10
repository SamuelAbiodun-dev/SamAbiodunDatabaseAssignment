package Chapter5;

import java.util.Scanner;

public class BarChart2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers between 1 and 30: ");
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        int inputNumber;
        int counter = 1;
        while(counter <= 5){
            inputNumber = input.nextInt();
            if(inputNumber >= 1 && inputNumber <= 30){
                switch(counter){
                    case 1:
                        number1 = inputNumber;
                        break;
                    case 2:
                        number2 = inputNumber;
                        break;
                    case 3:
                        number3 = inputNumber;
                        break;
                    case 4:
                        number4 = inputNumber;
                        break;
                    case 5:
                        number5 = inputNumber;
                        break;
                }
                counter++;
            }
            else {
                System.out.println("Please a number between 1 and 30");
            }
        }
        System.out.printf("%s%10s", "Number", "Bar");
        for(counter = 1; counter <= 5; counter++){
            int value = 1;
            switch(counter){
                case 1:
                    value = number1;
                    break;
                case 2:
                    value = number2;
                    break;
                case 3:
                    value = number3;
                    break;
                case 4:
                    value = number4;
                    break;
                case 5:
                    value = number5;
                    break;
            }
            System.out.println();
            for(int i = 1; i <= value; i++) {
                System.out.printf("%d", value);
                for (int j = 1; j <= value; j++) {
                    System.out.printf("%5s","*");
                    //System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
