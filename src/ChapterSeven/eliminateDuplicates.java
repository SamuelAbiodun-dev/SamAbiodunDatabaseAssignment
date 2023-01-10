package ChapterSeven;

import java.util.Scanner;

public class eliminateDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for(int index = 0; index < numbers.length; index++){
            numbers[index] = input.nextInt();
        }

            int[] distinctNumbers = eliminateDuplicates(numbers);
            System.out.print("The distinct numbers are: ");
            for(int element : distinctNumbers){
                if(element > 0){
                    System.out.print(" " + element);
                }
                System.out.println();
            }
        }

    public static int[] eliminateDuplicates(int[] list){
        int[] distinctList = new int[list.length];
        int index = 0;
        for(int element : list){
            if(linearSearch(distinctList, element) == -1){
                distinctList[index] = element;
                index++;
            }
        }
        return distinctList;
    }

    private static int linearSearch(int[] distinctList, int element) {
        for(int index = 0; index < distinctList.length; index++){
            if(element == distinctList[index]){
                return index;
            }
        }
        return -1;
    }

}
