package ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFilledTest {
   public ArrayFilled arrayFilled;

   @BeforeEach
   void setUp(){
       arrayFilled = new ArrayFilled();
   }
    @Test
    public void testThatArrayExists(){
       assertNotNull(arrayFilled);
    }
    @Test
    void testThatArrayHasComma(){
       assertEquals(10, ArrayFilled.fillArray());
    }

}