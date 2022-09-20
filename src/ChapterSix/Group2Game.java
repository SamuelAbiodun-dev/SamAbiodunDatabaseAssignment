package ChapterSix;

public class Group2Game {
    public static void main(String[] args) {
        GameCraps myGame = new GameCraps();
        myGame.rollDice();

        if(myGame.sumOfDice == 7 || myGame.sumOfDice == 11 ) {
            System.out.printf("you rolled %d%n", myGame.sumOfDice);
            System.out.printf("You %s!!%n", GameCraps.Status.WON);
        }
        else if(myGame.sumOfDice == 2 || myGame.sumOfDice == 3 || myGame.sumOfDice == 12) {
            System.out.printf("you rolled %d%n", myGame.sumOfDice);
            System.out.printf("You %s%n.", GameCraps.Status.LOST);
        }
        else {
            System.out.printf("you rolled %d%n", myGame.sumOfDice);
            System.out.printf("%s%n", GameCraps.Status.CONTINUE);
        }

    }
}
