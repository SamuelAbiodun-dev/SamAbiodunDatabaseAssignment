package ChapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitCounterTest {
@Test
    void testCounter(){
    int numberOfDigits = DigitCounter.count("!234%bgs");
    assertEquals(3, numberOfDigits);
}
@Test
    void testCount(){
    int numberOfDigits = DigitCounter.counter("@#___--");
    assertEquals(0, numberOfDigits);
}
}