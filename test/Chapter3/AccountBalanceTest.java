package Chapter3;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class AccountBalanceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountBalance acctBal = new AccountBalance();

        System.out.printf("The initial name entered is: %s%n%n", acctBal.getName());
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        acctBal.setName(name);

        System.out.printf("The name in the object account is: %s%n", acctBal.getName());

    }

}