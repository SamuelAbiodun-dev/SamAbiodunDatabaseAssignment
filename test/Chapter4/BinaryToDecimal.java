package Chapter4;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int number = input.nextInt();
        System.out.printf("%nDecimal of %d is: " + getDecimal(number), number);
    }
    public static int getDecimal(int binary){
        int decimal = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            }
            else{
                int temporary = binary % 10;
                decimal += temporary * Math.pow(2, power);
                binary = binary / 10;
                power++;
                System.out.printf("%n The binary number is: %d%n", binary);
                System.out.printf("%nThe number is: %d%n", temporary);
            }
        }
        return decimal;
    }
}
