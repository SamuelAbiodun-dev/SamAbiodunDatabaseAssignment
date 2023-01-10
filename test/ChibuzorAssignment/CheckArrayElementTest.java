package ChibuzorAssignment;

import static org.junit.jupiter.api.Assertions.*;

class CheckArrayElementTest {
    public static void main(String[] args) {
        int [] numbersArray = {10, 20, 30, 40, 50};
        int Value = 50;
        System.out.println(Value + " is found at index: " + CheckArrayElement.checkElement(numbersArray, Value));
    }

}