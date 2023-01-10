package ChapterSeven;

import java.security.SecureRandom;

public class Chapter7_8e {
    public static void main(String[] args) {
        int [] array = new int[100];
        SecureRandom randomNo = new SecureRandom();
        for(int index = 0; index<array.length; index++) {
           // randomNo.setSeed(4);
            int integer = 1 + randomNo.nextInt(100);
            array[index] = integer;

            System.out.printf("%d ", integer);
        }
        int product = array[2] * array[9];
        System.out.printf("%nThe product of the third and tenth elements in the array is: %d " ,product);
    }

}
