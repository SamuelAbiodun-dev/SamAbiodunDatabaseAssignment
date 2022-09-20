package Chapter5;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        Scanner sam = new Scanner(System.in);

        System.out.println("ENTER THE NO: ");

        int number1 = sam.nextInt();

        System.out.println("ENTER THE POWER FOR THAT NO: ");

        int number2 = sam.nextInt();

        int power = 1;

        if (number2 >= 1) {

            for (int i = 1; i <= number2; i++) {

                power = power * number1;

            }

            System.out.println(power);

        }

    }

}

