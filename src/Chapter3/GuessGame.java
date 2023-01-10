package Chapter3;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess;

        int coin = (int) (Math.random() * 2);

        while (true) {
            System.out.print("Enter a guess: 1 for head or 0 for tail: ");
            guess = input.nextInt();

            if (guess == coin) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Incorrect!");
                System.out.println("Willing to try again? Enter 'Yes' or 'No'");
                String response = input.next();

                if (response.equals("Yes")) {
                    continue;
                }
                if(response.equals("No")) {
                    break;
                }

            }
        }

    }
}

