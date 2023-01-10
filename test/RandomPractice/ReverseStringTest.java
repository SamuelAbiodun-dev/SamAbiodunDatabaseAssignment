package RandomPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    public void reverseStringTest(){
        String word = "olalekan";
        String word2 = ReverseString.reverseString(word);
        assertEquals("nakelalo", word2);
    }
@Test
    public void reverseCapitalString(){
        String word = "jerry";
        String word2 = ReverseString.reverseCapital(word);
        assertEquals("Jerry", word2);
}
@Test
    public void FirstUppercaseTest(){
        String word = "jerry";
        String word2 = ReverseString.FirstUppercase(word);
        assertEquals("Jerry", word2);
}
@Test
    public void AllUpperCaseTest(){
        String word = "JERRY";
        String word2 = ReverseString.AllUpperCase(word);
        assertEquals("JERRY",word2);
}
}