package Chapter3;

import static org.junit.jupiter.api.Assertions.*;

class AccountBalTest {
    public static void main(String[] args) {

        AccountBal acct1 = new AccountBal("Samuel Abiodun");
        AccountBal acct2 = new AccountBal("Ajiabde Samuel");

        System.out.printf("The name for the first account is: %s%n", acct1.getName());

        System.out.printf("The name for the second account is: %s%n", acct2.getName());



    }

}