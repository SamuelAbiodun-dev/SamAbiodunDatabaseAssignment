package Chapter3;

import java.util.Scanner;


class EliminateDuplicateTest {

        public static void main(String[] args) {
            //In the account that has a name and balance is an amount of money either on debit or credit
            //An account object that has name and balance is created
            EliminateDuplicate account1 = new EliminateDuplicate("Ajibade Samuel", 60.00);
            EliminateDuplicate account2 = new EliminateDuplicate("Abiodun Samuel", 120.00);
            //These two lines display the Account owner's name and balance
            displayAccount(account1);
            displayAccount(account2);
            //System.out.printf("%s (first account owner) balance: $%.2f%n", account1.getName(), account1.getBalance());
            System.out.printf("%s (second account owner) balance: $%.2f%n", account2.getName(), account2.getBalance());
            //This line enables a user input
            Scanner input = new Scanner(System.in);
            //New money has come into the first account
            System.out.println("Enter deposit amount for account1: ");
            //The money deposited into the account has been received
            double depositAmt = input.nextDouble();

            //The new process taking place is shown
            System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmt);
            account1.deposit(depositAmt);
            System.out.println();

            System.out.println();
            //The account status notification has been given
            System.out.println("Amount added successfully!");
            //The new balance has been displayed for the first account
            displayAccount(account1);
            displayAccount(account2);
            //System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
            //The second account still retains its balance
            displayAccount(account2);
            //System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
            //New money has come into the second account
            System.out.print("Enter deposit amount for account2: ");
            //The money deposited into the account has been received
            depositAmt = input.nextDouble();
            //The new process taking place is shown
            System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmt);
            account2.deposit(depositAmt);
            //The final balance of the two accounts is displayed
           // System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
            // System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
            displayAccount(account1);
            displayAccount(account2);
        }
    public static void displayAccount(EliminateDuplicate acct1) {
      //  System.out.print("%s (first account owner) balance: $%.2f%n");
       // acct1.displayAccount(acct1.name, acct1.balance);
        System.out.printf("%s balance: $%.2f%n", acct1.getName(), acct1.getBalance());
    }
    }



