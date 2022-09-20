package Chapter3;

import static org.junit.jupiter.api.Assertions.*;

class Account1Test {
    public static void main(String[] args) {
        Account1 account1 = new Account1("Ajibade Samuel");
        Account1 account2 = new Account1("Samuel Abiodun");

        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());

    }
}