package ChapterSeven;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodTest {
    public static void main(String[] args) {
        ArrayMethod method = new ArrayMethod();
        int[] numbers = {1,2,3,4,5};
        //OR
        // int [] numbers = new int numbers[];
        //number [0] = 1;
        //number [1] = 2;
        //number [2] = 3;
        //number [3] = 4;
        //number [4] = 5;
        System.out.printf("The sum of the numbers in the array is: %d%n", method.addNumbers(numbers));
    }

}