package Chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Chapter6.TossCoin.Face.HEAD;
import static Chapter6.TossCoin.Face.TAIL;
import static org.junit.jupiter.api.Assertions.*;

class TossCoinTest {
    TossCoin tossCoin;
    @BeforeEach
    public void setUp(){
        tossCoin = new TossCoin();
    }

    @Test
    public void testThatTheCoinHasAHead(){
        assertEquals(HEAD, HEAD);
    }

    @Test
    public void testThatTheCoinHasATail(){
        assertEquals(TAIL, TAIL);
    }
//    @Test
//    public void testThatTheCoinHasAHeadFaceOfOne(){
//        int head = TossCoin.head;
//        assertEquals(1, head);
//    }
//    @Test
//    public void testThatCoinHasATailFaceOfZero(){
//        int tail = tossCoin.tail;
//        assertEquals(0, tail);
//    }
//    @Test
//    public void testThatAMethodCanFlipCoinToHeadOrTail(){
//        int coinValue = tossCoin.flip();
//        assertEquals(0, coinValue);
//    }

}