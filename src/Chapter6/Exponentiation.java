package Chapter6;

import java.util.Scanner;

public class Exponentiation {
    public static int integerPower(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a base number: ");
        int base = input.nextInt();
        System.out.println("Enter its exponent: ");
        int exponent = input.nextInt();

        input.close();
        int power = 1;
        for(int counter = 1; counter <= exponent; counter++){
            if(exponent == 1){
                power = base;
            }
            else {
                power = power * base;
            }
        }
        System.out.printf("The power is: %d", power);
        return power;

    }

    public static void main(String[] args) {
        integerPower();
    }
}
