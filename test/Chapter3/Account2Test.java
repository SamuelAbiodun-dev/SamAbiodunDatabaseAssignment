package Chapter3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
class Account2Test {
    public static void main(String[] args) {
        Account2 account1 = new Account2("Ajibade Samuel", 25.00);
        Account2 account2 = new Account2("Samuel Abiodun", -45.00);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount to be deposited: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance %n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());


        System.out.print("Enter the amount to be deposited: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance %n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());


    }




}