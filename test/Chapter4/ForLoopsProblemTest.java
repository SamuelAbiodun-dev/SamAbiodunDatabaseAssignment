package Chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForLoopsProblemTest {
@Test
    public void testForFirstProblem(){
    String[] problemArray = ForLoopsProblem.problems;
    assertEquals("Food", problemArray[0]);
}
@Test
    public  void testForTheNumberOfNumber(){
    String[] problemArray = ForLoopsProblem.problems;
    assertEquals(4, problemArray.length);
}
}