package Chapter4;

import java.util.Scanner;
class enforcingPrivacyTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        enforcingPrivacy privateEnforcement = new enforcingPrivacy();
        System.out.println("Enter 5 values:");
        int input = scan.nextInt();
        privateEnforcement.passValue(input);
        scan.close();
    }
}