package RandomPractice.Tic.Tac;

import RandomPractice.TicTacToe2;
import org.junit.jupiter.api.Test;

class TicTacToe2Test {
    TicTacToe2 myGame = new TicTacToe2();

    @Test
    public void displayTheBoard(){
        myGame.displayBoard();
    }
    @Test
    public void movementTest(){
        myGame.move("X", 1);
        myGame.displayBoard();
    }
    @Test
    public void winningTest(){
        myGame.move("O", 1);
        myGame.move("O", 5);
        myGame.move("O", 9);
        myGame.displayBoard();
        System.out.println(myGame.playerWins());
    }

}