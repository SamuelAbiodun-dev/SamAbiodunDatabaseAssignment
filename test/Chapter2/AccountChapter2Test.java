package Chapter2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

public class AccountChapter2Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountChapter2 myAccount = new AccountChapter2();

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        System.out.println("Please enter the name:");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in object myAccount is:%n%s%n",
                myAccount.getName());
    }
}
