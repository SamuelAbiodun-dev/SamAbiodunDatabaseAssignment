package ChapterSeven;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {
    private Player player = new Player(1);

    //@BeforeEach
    //public void setUp(){
    // player = new Player();
    // }
    @Test
    public void testThatPlayersCanBeCreated() {
        assertNotNull(player);
    }

    @Test
    public void testThatPlayersCanPlayArcheryGame() {
        int[][] scoreBoard = new int[1][1];
        for (int[] row : scoreBoard) {
            Arrays.fill(row, -1);
        }
        Player.play(scoreBoard);
        int scoreBoardsFirstCell = scoreBoard[0][0];
        assertTrue(scoreBoardsFirstCell >= 0 && scoreBoardsFirstCell <= 10);
    }

    @Test
    public void testThatAnyPlayerCanPlay() {
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        Player player3 = new Player(3);
        int[][] scoreBoard = new int[3][3];
        for (int i = 0; i < scoreBoard.length; i++) {
            Arrays.fill(scoreBoard[i], -1);
        }

        player1.play(scoreBoard);
        int playerOneCell = scoreBoard[1][0];
        assertTrue(playerOneCell>= 0 && playerOneCell <= 10);

        player2.play(scoreBoard);
        int playerTwoCell = scoreBoard[1][0];
        assertTrue(playerTwoCell>= 0 && playerTwoCell <= 10);


        player3.play(scoreBoard);
        int playerThreeCell = scoreBoard[1][0];
        assertTrue(playerThreeCell>= 0 && playerThreeCell <= 10);
    }
}
