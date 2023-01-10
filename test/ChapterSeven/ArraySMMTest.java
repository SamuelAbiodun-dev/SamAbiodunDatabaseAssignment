package ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySMMTest {
    ArraySMM arraySMM;

    @BeforeEach
    void setUp(){
        arraySMM = new ArraySMM();
    }
    @Test
    @DisplayName("Test1")
    void testThatClassExists(){
        assertNotNull(arraySMM);
    }
    @Test
    @DisplayName("Test2")
    public void sumOfAnArray(){
        assertEquals(10,arraySMM.collectionOfArray());
    }
    @Test
    @DisplayName("Test3")
    public void minOfArrayTest(){
        assertEquals(1,arraySMM.minArray());
    }
    @Test
    @DisplayName("Test4")
    public void maxOfArrayTest(){
        assertEquals(4,arraySMM.maxArray());
    }

}