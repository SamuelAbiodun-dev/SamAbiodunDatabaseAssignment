package ChapterEight;

public class TicTacToeMain {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        int count = 0;
        game.displayBoard();
        while(true) {
         game.player1();
         if(game.isWin()){
             break;
         }
         ++count;
         game.makeMoves[count] = game.movePosition;
         if (count == 9) {
             System.out.println("It's a draw");
             break;
         }
         game.player2();
         if(game.isWin()){
             break;
         }
         ++count;
            game.makeMoves[count] = game.movePosition;
        }
    }
}
