package ChapterEight.Chapter8;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class CompoundInterest {
    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for(int year = 1; year <= 10; year++){
            BigDecimal amount =
            principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            System.out.printf("%3d%17s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }
    }
}
