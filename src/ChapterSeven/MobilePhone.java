package ChapterSeven;
import java.util.Scanner;
public class MobilePhone {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        NokiaPhone phone = new NokiaPhone();

        menu(phone);
    }

    private static void menu(NokiaPhone phone) {
        System.out.println("1. Phone book");
        System.out.println("2. Messages");
        System.out.println("3. Call Register");
        System.out.println("4. Tones");
        System.out.println("5. Settings");

        System.out.println("Please enter 1-5 to select Phone menu: ");
        int phoneMenu = input.nextInt();
        switch (phoneMenu) {
            case 1:
                phone.getPhoneBookOption();
                System.out.println("Enter between 1-7 to access the phone book menu options or 0 to go back to main menu");
                int phoneBookNo = input.nextInt();
                switch (phoneBookNo) {
                    case 1:
                        phone.getSearchOption();
                        break;
                    case 2:
                        phone.getSearchNoOption();
                        break;
                    case 3:
                        phone.getAddNameOption();
                        break;
                    case 4:
                        phone.getEditOption();
                        break;
                    case 5:
                        phone.getEraseOption();
                        break;
                    case 6:
                        phone.getAssignToneOption();
                        break;

                    case 7:
                        phone.getPhoneOptions();
                        break;

                    case 0:
                        menu(phone);
                }

            case 2:
                phone.getMessage();
                System.out.println("Enter between 1-4 to access the message menu options or 0 to go back to main menu");
                int message = input.nextInt();
                switch (message) {
                    case 1:
                        phone.getWriteMessagesOption();
                        break;
                    case 2:
                        phone.getInbox();
                        break;
                    case 3:
                        phone.getOutbox();
                        break;
                    case 4:
                        phone.getMessageSettings();
                        break;

                    case 0:
                        menu(phone);

                }

            case 3:
                phone.getCallRegister();
                System.out.println("Enter between 1-4 to access the call register menu options or 0 to go back to main menu");
                int register = input.nextInt();
                switch (register) {
                    case 1:
                        phone.getCallLogs();
                        break;
                    case 2:
                        phone.getRecent();
                        break;
                    case 3:
                        phone.getContacts();
                        break;
                    case 4:
                        phone.getProfile();
                        break;

                    case 0:
                        menu(phone);
                }
            case 4:
                phone.getRingTone();
                System.out.println("Enter between 1-2 to access the tone menu options or 0 to go back to main menu");
                int tones = input.nextInt();
                switch (tones) {
                    case 1:
                        phone.getSoundStatus();
                        break;
                    case 2:
                        phone.getRingTone();
                        break;

                    case 0:
                        menu(phone);
                }
            case 5:
                phone.getSetting();
                System.out.println("Enter between 1-6 to access the setting menu options or 0 to go back to main menu");
                int settings = input.nextInt();
                switch (settings) {
                    case 1:
                        phone.getMyPhone();
                        break;
                    case 2:
                        phone.getMobileNetwork();
                        break;
                    case 3:
                        phone.getWifiSetting();
                        break;
                    case 4:
                        phone.getDisplay();
                        break;
                    case 5:
                        phone.Storage();
                        break;
                    case 6:
                        phone.Security();
                        break;

                    case 0:
                        menu(phone);
                }
        }
    }
}

