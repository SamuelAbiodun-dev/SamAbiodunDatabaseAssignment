import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class CalculatorTest {
     Calculator myCalculator;
    @BeforeEach
    void startAllTestWith() {
        myCalculator = new Calculator(10, 20);
    }
    @Test
    void testThatObjectsExists() {
        assertNotNull(myCalculator);
    }
    @Test
    //
    void testThatCalculatorCanSolveSumOfNumbers(){
        assertEquals(5, myCalculator.addTwoNumbers(2,3));
    }
    @Test
    void testThatCalculatorCanSolveProductsOfNumbers(){

        assertEquals(6, myCalculator.productTwoNumbers(2,3));
    }
    @Test
    void testThatCalculatorCanSolveDivisionOfNumbers(){

        assertEquals(0, myCalculator.divideTwoNumbers(2,3));
    }
    @Test
     void testUserCanNotInputANegativeInteger(){
        assertEquals(6, myCalculator.receiveUsersInput(2,2,2));
    }

    }

