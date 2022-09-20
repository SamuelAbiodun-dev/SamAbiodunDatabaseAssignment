package Chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChapterTwoArithmeticTest {


    @Test
   public void testThatObjectExists() {
        ChapterTwoArithmetic arithmetic = new ChapterTwoArithmetic();
        assertNotNull(arithmetic);
        }
    @Test
    public void sumNumbers() {
        ChapterTwoArithmetic arithmetic = new ChapterTwoArithmetic();
        assertEquals(8,arithmetic.sumNumbers(2, 6));

    }


@Test
    void squareOfSumOfNumbers() {
    ChapterTwoArithmetic arithmetic = new ChapterTwoArithmetic();
    assertEquals(100, arithmetic.squareOfSumOfNumbers(5,5));
}
@Test
    void sqrtNum1() {
    ChapterTwoArithmetic arithmetic = new ChapterTwoArithmetic();
    assertEquals(9, arithmetic.sqrtNum1(81));

}
@Test
void sqrtSum() {
    ChapterTwoArithmetic arithmetic = new ChapterTwoArithmetic();
    assertEquals(13, arithmetic.sqrtSum(2,3));
}
    @Test
    public void numbersDifference() {
        ChapterTwoArithmetic arithmetic = new ChapterTwoArithmetic();
        assertEquals(4,arithmetic.numbersDifference(9, 5));
    }
    @Test
    public void squareOfDifferenceOfNumbers () {
        ChapterTwoArithmetic arithmetic = new ChapterTwoArithmetic();
        assertEquals(0, arithmetic.squareOfDifferenceOfNumbers(5,5));
    }
    @Test
    public void sqrtNum2() {
        ChapterTwoArithmetic arithmetic = new ChapterTwoArithmetic();
        assertEquals(2, arithmetic.sqrtNum2(5));
    }
    @Test
    public void sqrtDifference() {
        ChapterTwoArithmetic arithmetic = new ChapterTwoArithmetic();
        assertEquals(9, arithmetic.sqrtDifference(5,4));
    }

}

