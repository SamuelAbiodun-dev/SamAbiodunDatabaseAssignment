package Chapter3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter your name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("The name in the myAccount is: %n%s%n", myAccount.getName());
    }

}