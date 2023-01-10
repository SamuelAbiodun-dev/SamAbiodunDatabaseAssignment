package Chapter5;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int count = 1;
//        int number;
//        while (count <= 5) {
//            //for(int counter = 0; counter <= number; counter++){
//            System.out.printf("%nRound %d: Enter a number within the range of: 1 - 30 => ", count);
//            number = input.nextInt();
//            count++;
//            if (number >= 1 && number <= 30) {
//                for (int counter1 = 1; counter1 <= number; counter1++) {
//                    for (int stars = 1; stars <= number; stars++) {
//                        System.out.printf("%n%d%8s%n", stars, "*");
//                    }
//                    number = number + counter1;
//                    System.out.printf("%s%8s", "Number", "Bar");
//                }
////            } else {
////                System.out.println("Input number between 1 to 30");
////            }
//            }
//        }
        int number;
        int storeNumber = 0;
        int count;
        int stars;
        System.out.println("Enter a number within the range of 1 and 30: ");
        number = input.nextInt();
        for (count = 1; count <= 5; count++) {
            storeNumber = storeNumber + number;
        }
        System.out.println();
        for (stars = 0; stars < number; stars++) {
            System.out.print("*");
            System.out.printf("%s%10s%n", "Number", "Bar");
            System.out.printf("%s%10s%n", storeNumber, stars);
        }
    }
}