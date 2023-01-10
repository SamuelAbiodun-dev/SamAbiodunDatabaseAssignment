package Chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
    totalTax();
    }
    public static void  totalTax(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to start: ");
        int proceed = input.nextInt();

        while(proceed == 1){
            input.nextLine();
            System.out.println("As a citizen, enter your name: ");
            String name = input.nextLine();
            System.out.println("Enter yearly earnings: ");
            double earnings = input.nextDouble();
            System.out.println(earnings);
            if(earnings <= 30000){
                double taxRate = ((double) 15 / 100) * earnings;
                System.out.printf("The total tax of %s is: %.2f%n", name, taxRate);
            }
            else if(earnings > 30000){
                double taxRate = ((double) 20 / 100) * earnings;
                System.out.printf("The total tax of %s is: %.2f%n", name, taxRate);
            }
            System.out.println("Enter -1 to end or 1 to proceed: ");
             proceed = input.nextInt();
             if (proceed == -1){
                 break;
             }
        }
    }
}
