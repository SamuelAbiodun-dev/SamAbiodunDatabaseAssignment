package Chapter3;

import java.util.Scanner;

public class AccountPractice2Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountPractice2 account1 = new AccountPractice2("Samuel Peter", 57.00);
        AccountPractice2 account2 = new AccountPractice2("Rachael James", 46.98);
        System.out.printf("The initial name and balance for account1 are: %s, %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("The initial name and balance for account2 are: %s, %.2f%n", account2.getName(), account2.getBalance());
        System.out.println();

        System.out.println("Enter the balance to be deposited for the first account: ");
        double depositMoney1 = input.nextDouble();
        account1.deposit(depositMoney1);
        System.out.printf("%nThe current balance of %s's account is: %.2f", account1.getName(), account1.getBalance());
        System.out.println();

        System.out.println("Enter the balance to be deposited for the second account: ");
        double depositMoney2 = input.nextDouble();
        account2.deposit(depositMoney2);
        System.out.printf("%nThe current balance of %s's account is: %.2f", account2.getName(), account2.getBalance());

        System.out.printf("%n%s, Enter the amount of money to be transferred to account3: ", account2.getName());
        double moneyTransferred1 = input.nextDouble();
        account2.withdraw(moneyTransferred1);
        System.out.printf("%nThe current balance of %s's account is: %.2f", account2.getName(), account2.getBalance());

        System.out.printf("%n%s, Enter the amount of money to be deposited to your account: ", account1.getName());
        double depositMoney3 = input.nextDouble();
        account1.deposit(depositMoney3);
        System.out.printf("%nThe current balance of %s's account is: %.2f", account1.getName(), account1.getBalance());
        System.out.println();
    }
}