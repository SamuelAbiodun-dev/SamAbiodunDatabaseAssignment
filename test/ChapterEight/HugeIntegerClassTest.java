package ChapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerClassTest {
    HugeIntegerClass hugeInteger;
    @BeforeEach
    public void setUp(){
        hugeInteger = new HugeIntegerClass();
    }
    @Test
    public void testParseMethod(){
        String number = "1234";
        hugeInteger.parse(number);
        int[] array = hugeInteger.getDigitArray();
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
        assertEquals(4, array[3]);
    }
    @Test
    public void testIsEqualToMethod(){
        int number1 = 1;
        int number2 = 1;
        assertTrue(hugeInteger.isEqualTo(number1, number2));
    }

    @Test
    public void testIsNotEqualToMethod(){
        int number1 = 2;
        int number2 = 1;
        assertTrue(hugeInteger.isNotEqualTo(number1, number2));
    }

    @Test
    public void testIsGreaterThanMethod(){
        int number1 = 5;
        int number2 = 0;
        assertTrue(hugeInteger.isGreaterThan(number1, number2));
    }

    @Test
    public void testIsLessThanMethod(){
        int number1 = 5;
        int number2 = 0;
        assertTrue(hugeInteger.isLessThan(number2, number1));
    }

    @Test
    public void testIsLessThanOrEqualMethod(){
        int number1 = 5;
        int number2 = 0;
        assertTrue(hugeInteger.isLessThanOrEqualTo(number2, number1));
    }

    @Test
    public void testIsGreaterThanOrEqualMethod(){
        int number1 = 5;
        int number2 = 0;
        assertTrue(hugeInteger.isGreaterThanOrEqualTo(number1, number2));
    }

    @Test
    public void testIsZeroMethod(){
        int number = 0;
        assertTrue(hugeInteger.isZero(number));
    }

    @Test
    public void testToStringMethod(){
        int number = 5;
        assertEquals("5", hugeInteger.toString(number));
    }

    @Test
    public void testToStringMethod2(){
       String number = "5";
       hugeInteger.parse(number);
        assertEquals(number, hugeInteger.toString());
    }

    @Test
    public void testAddMethod(){
        int number1 = 45;
        int number2 = 90;
        assertEquals(135, hugeInteger.add(number1, number2));
    }

    @Test
    public void testSubtractMethod(){
        int number1 = 45;
        int number2 = 90;
        assertEquals(45, hugeInteger.subtract(number2, number1));
    }

    @Test
    public void testSetMethod(){
        hugeInteger.setNumber(1234);
        int[] array = hugeInteger.getDigitArray();
        assertEquals(1,array[0]);
        assertEquals(2,array[1]);
        assertEquals(3,array[2]);
        assertEquals(4,array[3]);
    }

    @Test
    public void testGetMethod(){
       hugeInteger.setNumber(1234);
        assertEquals(1234, hugeInteger.getNumber());
    }
}