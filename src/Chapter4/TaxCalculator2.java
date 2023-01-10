package Chapter4;

import java.math.BigDecimal;

public class TaxCalculator2 {

    private static final BigDecimal MINIMUM_EARNING = BigDecimal.valueOf(30000);
    private static final double BASE_TAX_RATE = 0.15;
    private static final double ADDITIONAL_TAX_RATE = 0.20;
    public static BigDecimal calculateTax(Citizen citizen){
        BigDecimal taxAmount = BigDecimal.ZERO;
        if(citizen.getEarnings().compareTo(MINIMUM_EARNING) > 0) {
            BigDecimal excessMoney = (citizen.getEarnings().subtract(MINIMUM_EARNING));
                    BigDecimal excessMoneyPercentage = excessMoney.multiply(BigDecimal.valueOf(ADDITIONAL_TAX_RATE));
                            taxAmount = MINIMUM_EARNING.multiply(BigDecimal.valueOf(BASE_TAX_RATE)).add(excessMoneyPercentage);
        }
        else {
            taxAmount = citizen.getEarnings().multiply(BigDecimal.valueOf(BASE_TAX_RATE));
        }
        return taxAmount;
    }
}
