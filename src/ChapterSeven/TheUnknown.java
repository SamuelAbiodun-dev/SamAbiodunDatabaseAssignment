package ChapterSeven;

import java.util.Objects;
import java.util.Scanner;

public class TheUnknown {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int drops = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int nails = input.nextInt() - 1;

        String[] paths = new String[nails * drops];
        int[] balls = new int[nails];

        int numberOfRs =  0;
        for(int index = 0; index < paths.length; index++){
            paths[index] = getRandomPath();

            if(Objects.equals(paths[index], "R")){
                numberOfRs++;
            }
            if((index + 1) % nails == 0){
                balls[numberOfRs]++;
                numberOfRs = 0;
            }
        }
        print(paths, nails);
        print(balls);
    }

    private static String getRandomPath() {
        if((int)(Math.random() * 2) == 0){
            return "L";
        }
        else{
            return "R";
        }
    }
    public static void print(String[] list, int numberOfElements){
        System.out.println();
        for(int index = 0; index < list.length; index++){
            System.out.print(((index + 1) % numberOfElements == 0) ? list[index] +
                    "\n" : list[index]);
        }
    }

    public static void print(int[] list){
        int max = max(list);
        while(max > 0){
            System.out.println();
            for(int index = 0; index < list.length; index++){
                if(list[index] >= max){
                    System.out.print("o");
                }
                else {
                    System.out.print(" ");
                }
                max--;
            }
            System.out.println();
        }
    }
    public static int max(int[] list){
        int max = list[0];
        for(int index = 1; index < list.length; index++){
            if(list[index] > max){
                max = list[index];
            }
        }
        return max;
    }
}
