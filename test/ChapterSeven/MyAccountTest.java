package ChapterSeven;
import java.util.Scanner;


class MyAccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyAccount myAccount = new MyAccount();

        System.out.printf("The initial name is: %s%n", myAccount.getName());

        System.out.println("Please enter your name here: ");
        String name = input.nextLine();
        myAccount.setName(name);
        System.out.println();

        System.out.printf("The name in the myAccount is: %n%s%n", myAccount.getName());
    }
}