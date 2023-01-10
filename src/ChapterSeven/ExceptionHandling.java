package ChapterSeven;
//
public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = new int[3];
try {
    numbers[0] = 2;
    numbers[1] = 4;
    numbers[2] = 6;
    numbers[3] = 8;
    numbers[4] = 10;
}
catch(ArrayIndexOutOfBoundsException | NullPointerException | IllegalArgumentException e) {
    System.out.println(e);
    System.out.println("You are going out of bound!");
}
for(int counter = 0; counter < numbers.length; counter++) {
    System.out.println(numbers[counter]);
}
    }
    //OR
    //public static int [] populateArray
}
