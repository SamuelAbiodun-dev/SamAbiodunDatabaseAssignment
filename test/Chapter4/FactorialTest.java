package Chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @BeforeEach
    public void setUp(){
    }
    @Test
    public void getFactorial(){
        long factorial = Factorial.factorial2(10);
        assertEquals(3628800, factorial);
    }
    @Test
    public void getFactorial2(){
        double factorial = Factorial.factorialExponents(2);
        assertEquals(2.5, factorial);
    }
    @Test
    public void getFactorialExponents(){
        double factorial = Factorial.factorialExponentsPower(2);
        assertEquals(5,factorial);
    }
}