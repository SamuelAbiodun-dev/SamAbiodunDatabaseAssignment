package Chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculator2Test {
private TaxCalculator2 calculator;
private Citizen mathias;
private Citizen dewunmi;
private Citizen deola;
@BeforeEach
    public void setUp(){
        mathias = new Citizen();
        mathias.setFirstName("Mathias");
        mathias.setSurName("Momodu");
        mathias.setEarnings( new BigDecimal(17000));

        dewunmi = new Citizen("Adeunmi", "Adegunwa");
        dewunmi.setEarnings(BigDecimal.valueOf(25000));

        deola = new Citizen("Adeola", "Adekunle");
        deola.setEarnings(BigDecimal.valueOf(45000));
    }

    @Test
    public void calculateTax(){
    BigDecimal mathiasTax = TaxCalculator2.calculateTax(mathias);
    assertEquals(2550, mathiasTax.intValue());

    BigDecimal dewunmiTax = TaxCalculator2.calculateTax(dewunmi);
    assertEquals(3750, dewunmiTax.intValue());
    }

    @Test
    public void calculateEssenceTax(){
        BigDecimal adeolaTax = TaxCalculator2.calculateTax(deola);
        assertEquals(7500, adeolaTax.intValue());
    }
}