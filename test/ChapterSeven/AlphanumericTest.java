package ChapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphanumericTest {
@Test
    public void testThatItCanAcceptStrings(){
    int numberOfDigits = Alphanumeric.countVariable("@@@");
    assertEquals(0, numberOfDigits);
}
}