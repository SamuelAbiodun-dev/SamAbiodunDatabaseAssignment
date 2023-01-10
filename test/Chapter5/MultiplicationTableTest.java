package Chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {
    @Test
    public void testThatICanMultiply(){
        int numbers = MultiplicationTable.multiply(2);
        assertEquals(24, numbers);
    }

}