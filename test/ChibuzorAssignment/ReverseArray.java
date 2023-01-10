package ChibuzorAssignment;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4};
        System.out.println("The original array: ");
        for(int index = 0; index < array.length; index++){
            System.out.print(array[index] + " ");
        }
        System.out.printf("%nThe reversed array: %n");
        for(int index = array.length - 1; index >= 0; index--){
            System.out.print(array[index] + " ");
        }
    }
}
