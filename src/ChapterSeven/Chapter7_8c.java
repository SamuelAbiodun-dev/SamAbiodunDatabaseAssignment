package ChapterSeven;

import java.security.SecureRandom;

public class Chapter7_8c {
    public static void main(String[] args) {
        SecureRandom randomNos = new SecureRandom();
        double[] c = new double[100];

        for (int index = 0; index < c.length; index++) {
            double value = 1 + randomNos.nextDouble(30);
            c[index] = value;
        }
        for (int number = 0; number < c.length; number++) {

            System.out.printf("%.2f%n", c[number]);
        }
        double maximumNo = c[0];
        for (int i = 0; i <= 99; i++) {
            if (c[i] > maximumNo) {
                maximumNo = c[i];
            }
        }
        System.out.printf("%nThe maximum number of the first 30 elements in the array c is: %.2f%n", maximumNo);
    }
}