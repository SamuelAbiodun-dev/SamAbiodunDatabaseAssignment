package ChapterSeven;
import java.util.Scanner;
public class MyPhoneMenu {

    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Contacts");
        System.out.println("2. Messages");
        System.out.println("3. Call History");
        System.out.println("4. Settings");
        System.out.println("5. Clock");
        System.out.println("6. Calculator");

        System.out.print("> Enter 1-6 to access the sub-menu functions here: ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.printf("%nCONTACTS%n");
                System.out.println("1. New");
                System.out.println("2. Search");
                System.out.println("3. Delete");
                System.out.println("4. Copy/Move");
                System.out.println("5. Import/Export");
                System.out.println("Enter 99 to go back: ");
                int back = input.nextInt();
                if (back == 99) {
                    mainMenu();
                }
                break;

            case 2:
                System.out.println("1. Write message");
                System.out.println("2. Inbox");
                System.out.println("3. Outbox");
                System.out.println("4. Sent box");
                System.out.println("5. Drafts");
                System.out.println("Enter 99 to go back: ");
                back = input.nextInt();
                if (back == 99) {
                    mainMenu();
                }
                break;

            case 3:
                System.out.println("1. Call logs");
                System.out.println("2. Dialed calls");
                System.out.println("3. Received calls");
                System.out.println("4. Missed calls");
                System.out.println("5. Call timers");
                back = input.nextInt();
                if (back == 99) {
                    mainMenu();
                }
                break;

            case 4:
                System.out.println("1. Call settings");
                System.out.println("2. Phone settings");
                System.out.println("3. Security settings");
                System.out.println("4. Restore factory settings");
                back = input.nextInt();
                if (back == 99) {
                    mainMenu();
                }
                break;

            case 5:
                System.out.println("1. Alarm clock");
                System.out.println("2. Clock settings");
                System.out.println("3. Date settings");
                System.out.println("4. Stopwatch");
                System.out.println("5. Countdown timer");
                System.out.println("6. Auto update of date and time");
                back = input.nextInt();
                if (back == 99) {
                    mainMenu();
                }
                break;
            case 6:
               NokiaPhone.calculate();
               break;
            default:
                System.out.println("Invalid input");

        }
    }


}
