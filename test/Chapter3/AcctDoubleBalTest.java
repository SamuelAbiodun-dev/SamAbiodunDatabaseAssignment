package Chapter3;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class AcctDoubleBalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AcctDoubleBal acct1 = new AcctDoubleBal("Ajiabde Samuel", 70.65);
        AcctDoubleBal acct2 = new AcctDoubleBal("Samuel Abiodun", -67.09);
        System.out.printf("%s balance is %.2f%n", acct1.getName(), acct1.getBalance());
        System.out.printf("%s balance is %.2f%n%n", acct2.getName(), acct2.getBalance());

        System.out.print("Please enter the deposit for the first account here: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to the first account balance%n%n", depositAmount);
        acct1.deposit(depositAmount);

        System.out.printf("%s's balance is: $%.2f%n", acct1.getName(), acct1.getBalance());
        System.out.printf("%s's balance is: $%.2f%n", acct2.getName(), acct2.getBalance());

        System.out.print("Please enter the deposit for the first account here: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to the second account balance%n%n", depositAmount);
        acct2.deposit(depositAmount);

        System.out.printf("%s's balance is: $%.2f%n", acct1.getName(), acct1.getBalance());
        System.out.printf("%s's balance is: $%.2f%n", acct2.getName(), acct2.getBalance());

}
}

