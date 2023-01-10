package ChapterSeven;


import java.util.Scanner;

public class reverseAnArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter ten numbers: ");
        for(int index = 0; index < numbers.length; index++){
            numbers[index] = input.nextInt();
        }
        reverse(numbers);
//        for( number : numbers){
//            System.out.print(number + " ");
//        }
        System.out.println();
    }
    public static void reverse(int[] list){
        for(int j = list.length-1; j >= 0; j--) {
            System.out.print(list[j] + " ");
            }
        }
    }


