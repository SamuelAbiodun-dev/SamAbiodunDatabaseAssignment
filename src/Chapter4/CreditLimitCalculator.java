package Chapter4;
import java.util.Scanner;
public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 720_000;
        int items = 0;
        int credit = 0;
        int newBalance = balance + (balance - credit) - credit;
        System.out.println("Type the name of the bank and your account number (FORMAT: 0730739715 of Access Bank): ");
        String nameBal = input.nextLine();
        System.out.printf("Balance of %s at the beginning of the month is: $%d%n", nameBal, balance);
        System.out.println("Enter 1 to view charges");
        int proceed = input.nextInt();
        if (proceed == 1) {
            System.out.println("Enter the number of items:");
            int goods = input.nextInt();
            items = items + goods;
            System.out.printf("Total of all items charged by %s this month is: %d%n", nameBal, items);
            if (goods < 15) {
                System.out.printf("Total of credit applied to the account of %s this month is: %d%n", nameBal, credit = balance - (goods / 3));
            }
            else if(goods > 15) {
                System.out.printf("Allowed credit is: %d%n", credit = balance - (goods / 3));
                System.out.println("Credit limit exceeded.");
            }
            System.out.printf("The charges for the %s goods that you purchased is: %d%n", goods, balance - credit);
            System.out.printf("The new balance is: %d%n", balance + (balance - credit) - credit);

        }

    }
}
