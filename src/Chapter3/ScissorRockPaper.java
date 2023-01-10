package Chapter3;

import java.util.Scanner;

public class ScissorRockPaper {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        computerValue();
        switch (computerValue()) {
            case 0 -> System.out.print("Scissor");
            case 1 -> System.out.print("Rock");
            case 2 -> System.out.print("Paper");
        }
        System.out.print("Scissor(0), Rock(1), Paper(2): ");
        int user = input.nextInt();

        System.out.print("You are ");
        switch (user) {
            case 0 -> System.out.println("Scissor");
            case 1 -> System.out.println("Rock");
            case 2 -> System.out.println("Paper");
        }

        if(computerValue() == user){
            System.out.println(" too. It is a draw");
        }
        else{
            boolean win = (user == 0 && computerValue() == 2) ||
                    (user == 1 && computerValue() == 0) ||
                    (user == 2 && computerValue() == 1);

            if(win){
                System.out.println("You won");
            }
            else{
                System.out.println("You lose");
            }
        }
    }
    public static int computerValue() {
        return (int) (Math.random() * 3);
    }
}

