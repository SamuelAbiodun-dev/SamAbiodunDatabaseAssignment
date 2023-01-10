package Chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargesTest {
    ParkingCharges parkingCharges;
    @BeforeEach
    public void setUp(){
        parkingCharges = new ParkingCharges("Sam", 24);
    }
@Test
    public void testThatCustomerHasName(){
        assertEquals("Sam", parkingCharges.getCustomerName());
}

@Test
    public void testThatTheMinimumChargeIsTwoDollars(){
        assertEquals(2.00, parkingCharges.getMinimumGarageCharges());
}

@Test
    public void testThatTheMaximumChargeIsTenDollars(){
        assertEquals(10.00, parkingCharges.getMaximumGarageCharges());
}

@Test
    public void testThatTheChargesWithinTheRangeOfThreeIsTwoDollars(){
        assertEquals(2.00, parkingCharges.chargesWithinTheHourRangeOfThree());
}
@Test
    public void testThatTheChargeIncreasesByZeroPointFiveIfTheHourIsGreaterThanThree(){
        assertEquals(2.50, parkingCharges.incrementAfter3Hours());
}
@Test
    public void testThatTheChargeIsTenDollarsAt24Hours(){
        assertEquals(10.00, parkingCharges.incrementAfter3Hours());
}
@Test
    public void testThatTheDiscountOf24Hours(){
        assertEquals(2.5, parkingCharges.twenty_fourHoursParkingDiscount());
}

}
