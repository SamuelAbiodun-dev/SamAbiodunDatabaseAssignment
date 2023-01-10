package ChapterSeven;

import java.util.Arrays;

public class ArcheryGame {
    public Player[] players;
    //private static int numberOfArchers;

    public ArcheryGame(int numbersOfArchers){
        Player[] archers = addPlayers(numbersOfArchers);
        players = Arrays.copyOf(archers, archers.length);
        for(int i = 0; i < numbersOfArchers; i++){
            players[i] = new Player(i+1);
        }
    }

    public static int[] calculatePlayerScoreTotal(int[][] scoreBoard) {
        int numberOfPlayers = scoreBoard.length;
        int[] totals = new int[numberOfPlayers];
        for(int row = 0; row < scoreBoard.length; row++){
            int[] playersRow = scoreBoard[row];
            int playersTotal = 0;
            for(int column = 0; column < playersRow.length; column++){
                playersTotal= playersTotal + playersRow[column];
            }
            totals[row] = playersTotal;
        }
        return totals;
    }
    public Player[] getPlayers() {
        return players;
    }
//    public void setPlayers(Player[] players) {
//        this.players = players;
//    }
    public static Player[] addPlayers(int numberOfArchers){
        Player[] archers = new Player[numberOfArchers];
        for(int index = 0; index < numberOfArchers; index++){
            archers[index] = new Player(index+1);
        }
        return archers;
    }
}
