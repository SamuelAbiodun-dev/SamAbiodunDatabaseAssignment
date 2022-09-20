package ChapterSix;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameCrapsTest {
    @Test
    public void winsWith7Or11() {
        //I have a random play
       GameCraps dice = new GameCraps();
        //when the player rolls the dice at first attempt
        dice.sumOfDice = 11;
        //check if the player won
        assertSame(dice.getStatus(), GameCraps.Status.WON );
    }

    @Test
    public void losesWith2_3_12(){
        // I have a random play
        GameCraps dice = new GameCraps();
        //when the player rolls the dice at first attempt
        dice.sumOfDice = 2;
        // check if the player lost
        assertSame(dice.getStatus(), GameCraps.Status.LOST);
    }

    @Test
    public void continuesWithNoOtherThan7_11_2_3_12(){
        // I have a random play
        GameCraps dice = new GameCraps();
        //when the player rolls the dice at first attempt
        dice.sumOfDice = 9;
        // check if the player lost
        assertSame(dice.getStatus(), GameCraps.Status.CONTINUE);
    }
    @Test
    public void playerPointTest(){
        GameCraps dice = new GameCraps();
        dice.sumOfDice = 5;
        assertSame(dice.getStatus(), GameCraps.Status.CONTINUE);
    }


    }
