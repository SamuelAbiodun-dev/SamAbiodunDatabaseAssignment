
package ChapterSix;
import java.security.SecureRandom;
public class GameCraps {
SecureRandom randomNumber = new SecureRandom();
private int myPoint;
public void rollDice(){
    int die1 = 1 + randomNumber.nextInt(6);
    int die2 = 1 + randomNumber.nextInt(6);

    sumOfDice = die1 + die2;
}
    public Status playerStatus;
    public int playerPoint;
    public int sumOfDice;

    public enum Status{WON, LOST, CONTINUE};
        public Status getStatus() {


            switch (sumOfDice) {

                case 7:
                case 11:
                    playerStatus = Status.WON;
                    System.out.println("Player wins!");
                    break;

                case 2:
                case 3:
                case 12:
                    playerStatus = Status.LOST;
                    System.out.println("Player loses!");
                    break;

                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                        playerStatus = Status.CONTINUE;
                    System.out.println("Continue!");
                    break;

                default: {
                    sumOfDice = playerPoint;
                    do {
                        playerStatus = Status.CONTINUE;

                        System.out.println("Sum:\t" + sumOfDice + "\n");

                    } while (sumOfDice != 7 && sumOfDice != playerPoint);

                    if (sumOfDice == playerPoint)
                        System.out.println("Player wins!");
                    else
                        System.out.println("Player loses!");

                }
            }
            return playerStatus;
        }
public int getMyPoint(){
            return myPoint;
}
        }
