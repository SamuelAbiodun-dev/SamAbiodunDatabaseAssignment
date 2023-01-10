package Chapter6;

import java.util.Scanner;

public class TossCoinMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TossCoin tossCoin = new TossCoin();

        int headCounter = 0;
        int tailCounter = 0;

        System.out.println("Enter number of roll:");
        int roll = scanner.nextInt();

        System.out.print("You rolled: ");
        for (int i = 1; i <= roll; i++) {
            TossCoin.Face face = tossCoin.flip();
            System.out.printf("%s ", face);
            if (face.equals(TossCoin.Face.HEAD)) {
                headCounter++;
            }
            else {
                tailCounter++;
            }
        }
        System.out.printf("%nHead count = %d%nTail count = %d%n",
                headCounter, tailCounter);
    }
}
