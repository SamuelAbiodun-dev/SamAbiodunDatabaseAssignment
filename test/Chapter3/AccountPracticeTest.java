package Chapter3;

import java.util.Scanner;
class AccountPracticeTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        AccountPractice account = new AccountPractice();
        System.out.printf("The initial name of the account is %s%n", account.getName());
        System.out.println("Kindly enter your account name: ");
        String customerName = input.nextLine();
        account.setName(customerName);
        System.out.println();
        System.out.printf("The new account name is: %s", account.getName());
    }
}