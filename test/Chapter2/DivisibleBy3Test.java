package Chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleBy3Test {
    @Test
    void testThatANumberIsDivisibleBy3() {
        DivisibleBy3 divide3 = new DivisibleBy3();
        assertEquals(2, divide3.division3(6));
    }
}