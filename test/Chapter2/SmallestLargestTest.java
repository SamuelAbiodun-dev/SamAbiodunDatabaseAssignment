package Chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestLargestTest {
    @Test
    void testThatObjectExists() {
        SmallestLargest smallLarge = new SmallestLargest();
        assertNotNull(smallLarge);
    }
    @Test
    void testSum() {
        SmallestLargest smallLarge = new SmallestLargest();
        assertEquals(6,smallLarge.sum(1,2,3));
    }
    @Test
    void testAverage() {
        SmallestLargest smallLarge = new SmallestLargest();
        assertEquals(2,smallLarge.average(1,2,3));
    }
    @Test
    void testProduct() {
        SmallestLargest smallLarge = new SmallestLargest();
        assertEquals(6,smallLarge.product(1,2,3));
    }
    @Test
    void testSmallest() {
        SmallestLargest smallLarge = new SmallestLargest();
        assertEquals(1,smallLarge.smallest(1,2,3));
    }
    @Test
    void testLargest() {
        SmallestLargest smallLarge = new SmallestLargest();
        assertEquals(3,smallLarge.largest(1,2,3));
    }
}