package ChapterSeven;

public class Array4 {
    //Pseudocode:
   //create an array of seven (7) values
    //initialize the sum of the values to be zero
    //using for loop, initialize the counters of the values to be zero
    //condition the continuation by making the number if counting to be less than the length of the array "values"
    //the increment should take place by 1
    //The new sum should be the addition of the sum "0" and the values continually according to their index and stops after the condition is false

    public static void main(String[] args) {
        int[] values = {12,13,14,15,16,17,18};
        int addition = 0;
        for (int counter = 0; counter < values.length; counter++){
            addition = addition + values[counter];
        }
            System.out.printf("The sum of the values in the array is: %d%n", addition);
        }

        }





