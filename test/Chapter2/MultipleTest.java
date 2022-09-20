package Chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleTest {
    @Test
    void testThatAnObjectExists() {
        Multiple multiple = new Multiple();
        assertNotNull(multiple);
    }
    @Test
    void testThatANumberIsAMultipleOf3() {
        Multiple multiple = new Multiple();
        assertEquals(9, multiple.multipleOfNo(3));
    }
}
