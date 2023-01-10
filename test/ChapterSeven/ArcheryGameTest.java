package ChapterSeven;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
class ArcheryGameTest {
   ArcheryGame game = new ArcheryGame(4);
   Player player = new Player(1);
    @Test
    public void testThatGameExists(){

        assertNotNull(game);
    }
    @Test
    public void testThatPlayersExist(){
        Player[] players = game.getPlayers();
        assertNotNull(players);
        assertTrue(players.length > 0);
        System.out.println(Arrays.toString(players));
    }
    @Test
    public void testThatGAmeHasPlayer(){
        Player[] players = game.getPlayers();
//        Player firstPlayer = players[0];
//        System.out.println((players[0]));
        Player player = players[0];
        assertNotNull(player);
    }
@Test
    public void testThatPlayersCanPlayerCanPlay(){
        int[][] scoreBoard = new int[1][1];
        for(int[] row: scoreBoard){
            Arrays.fill(row, -1);
        }
        Player.play(scoreBoard);
        assertTrue(scoreBoard[0][0] < 0 || scoreBoard[0][0] <= 10);
}

@Test
    public void testThatPlayerTotalCanBeCalculated(){
        int[][] scoreBoard = {{3,4,5}, {5,5,6}, {4,1,9}};
        int[] totals = ArcheryGame.calculatePlayerScoreTotal(scoreBoard);
        assertEquals(totals[0], 12);
        assertEquals(totals[1], 16);
        assertEquals(totals[2], 14);

}

}