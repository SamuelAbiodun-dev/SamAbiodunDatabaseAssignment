package Chapter6;

import java.math.BigDecimal;

public class MathMethods {
    public static void main(String[] args) {
        double a = Math.abs(-7.5);
        double b = Math.floor(5 + 2.5);
        double c = Math.ceil(2.2);
        BigDecimal d = BigDecimal.valueOf(Math.floor(5));
        double e = Math.abs(9) + Math.ceil(2.2);
        double f = Math.ceil(-5.2);
        double g = Math.abs(-5) + Math.abs(4);
        double h = Math.ceil(-6.4) - Math.floor(5.2);
        double i = Math.ceil(-Math.abs(-3 + Math.floor(-2.5)));
        System.out.printf("%.1f%n", a);
        System.out.printf("%.1f%n", b);
        System.out.printf("%.1f%n", c);
        System.out.printf("%.1f%n", d);
        System.out.printf("%.1f%n", e);
        System.out.printf("%.1f%n", f);
        System.out.printf("%.1f%n", g);
        System.out.printf("%.1f%n", h);
        System.out.printf("%.1f%n", i);
    }
}
