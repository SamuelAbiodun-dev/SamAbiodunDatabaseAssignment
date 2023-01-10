package ChapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe game = new TicTacToe();
    @Test
    public void displayBoardTest() {
        game.displayBoard();
    }

    @Test
    public void makeMoveTest() {
        game.makeMove("X", 5);
        game.displayBoard();
    }

    @Test
    public void isWinTest() {
        game.makeMove("O", 1);
        game.makeMove("O", 2);
        game.makeMove("O", 3);
        game.displayBoard();
        System.out.println(game.isWin());
    }

}