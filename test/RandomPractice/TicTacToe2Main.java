package RandomPractice;

class TicTacToe2Main {
    public static void main(String[] args) {

        TicTacToe2 myGame = new TicTacToe2();
        int counter = 0;
        myGame.displayBoard();
        while(true){
            myGame.player1();
            if(myGame.playerWins()){
                break;
            }
            counter++;
            myGame.movesArray[counter] = myGame.userPosition;
            if(counter == 9){
                System.out.println("There is no winner");
                break;
            }
            myGame.player2();
            if(myGame.playerWins()){
                break;
            }
            counter++;
            myGame.movesArray[counter] = myGame.userPosition;
            if(counter == 9){
                System.out.println("There is no winner");
                break;
            }
            counter++;
            myGame.movesArray[counter] = myGame.userPosition;
        }

    }
}