package Chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chp2ComparisonTest {
    @Test
    public void testThatObjectExists() {
        Chp2Comparison comparison = new Chp2Comparison();
        assertNotNull(comparison);
    }

    @Test
    public void testThatNumberExists() {
        Chp2Comparison comparison = new Chp2Comparison();
        assertEquals(0, comparison.number(0));

    }

    @Test
    public void testThatTheSecondNumberExists() {
        Chp2Comparison comparison = new Chp2Comparison();
        assertEquals(100, comparison.number2(100));
    }

    @Test
    public void testThatTheFirstNumberHasASquareValue() {
        Chp2Comparison comparison = new Chp2Comparison();
        assertEquals(25, comparison.numSquare(5));
    }

    @Test
    public void testThatFirstNumberIsGreaterThan100() {
        Chp2Comparison comparison = new Chp2Comparison();
        assertEquals(true, comparison.numGreater(5));
    }

    @Test
    public void testThatTheSquareOfFirstNumberIsLesserThan100() {
        Chp2Comparison comparison = new Chp2Comparison();
        assertEquals(false, comparison.numSquareLesser(17));
    }

    @Test
    public void testThatTheSquareOfFirstNumberIsGreaterThan100() {
        Chp2Comparison comparison = new Chp2Comparison();
        assertEquals(true, comparison.numSquareGreater(17));
    }

    @Test
    public void testThatTheSquareOfFirstNumberIsEqualTo100() {
        Chp2Comparison comparison = new Chp2Comparison();
        assertEquals(false, comparison.numSquareEqual(17));
    }

    @Test
    public void testThatTheSquareOfFirstNumberIsNotEqualTo100() {
        Chp2Comparison comparison = new Chp2Comparison();
        assertEquals(true, comparison.numSquareNotEqual(17));

    }
}