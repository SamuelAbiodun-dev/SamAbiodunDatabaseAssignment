package ChapterSeven;

import java.security.SecureRandom;

public class Player {
    private static int id;
    public Player(int id){
    Player.id = id;
    }
    public static void play(int[][] scoreBoard) {
        int score = generateArcherScore();
        if(id == 1){
            int[] playerOnesRow = scoreBoard[0];
            for (int i = 0; i<playerOnesRow.length; i++) {
                if(playerOnesRow[i] == -1) {
                    playerOnesRow[i] = score;
                    break;
                }
            }
        }
    }
    private static int generateArcherScore(){
        SecureRandom random = new SecureRandom();
        return random.nextInt(0, 11);

    }
}
