package myPrintAndInput;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class myInputPrint {
    private static Scanner input1 = new Scanner(System.in);
    private static Scanner input2 = new Scanner(System.in);
    private static Scanner input3 = new Scanner(System.in);
    private static Scanner input4 = new Scanner(System.in);
    public static void print(String prompt){
        out.print(prompt);
    }
//    public static void print(){
//        newLine();
//    }

//    private void newLine() {
//        try {
//            synchronized (this) {
//                input1.close();
//                input2.close();
//                input3.close();
//                input4.close();
//                BufferedWriter textOut = null;
//                textOut.newLine();
//                textOut.flush();
//                BufferedOutputStream charOut = null;
//                charOut.flush();
//                boolean autoFlush = false;
//                if (autoFlush)
//                    out.flush();
//            }
//        }
//        catch (InterruptedIOException x) {
//            Thread.currentThread().interrupt();
//        }
////        catch (IOException x) {
////            trouble = true;
////        }
//    }

    public static void print(String[] prompt){
        out.print(Arrays.toString(prompt));

    }

    public static void print(int prompt){
        out.print(prompt);
    }
    public static void print(int[] prompt){
        out.print(Arrays.toString(prompt));
    }

    public static void print(double prompt){
        out.print(prompt);
    }
    public static void print(double[] prompt){
        out.print(Arrays.toString(prompt));
    }

    public static void print(float prompt){
        out.print(prompt);
    }
    public static void print(float[] prompt){
        out.print(Arrays.toString(prompt));
    }

    public static void print(char prompt){
        out.print(prompt);
    }
    public static void print(char[] prompt){
        out.print(prompt);
    }

    public static void print(long prompt){
        out.print(prompt);
    }
    public static void print(long[] prompt){
        out.print(Arrays.toString(prompt));
    }


    public static void print(boolean prompt){
        out.print(prompt);
    }
    public static void print(boolean[] prompt){
        out.print(Arrays.toString(prompt));
    }

    public static String input(String prompt){
        prompt = input1.nextLine();
        return prompt;
    }
    public static String[] input(String[] prompt){
        for(int index = 0; index < prompt.length; index++){
            prompt[index] = input1.nextLine();
        }
        return prompt;
    }

    public static int input(int prompt){
        prompt = input2.nextInt();
        return prompt;
    }
    public static int[] input(int[] prompt){
        for(int index = 0; index < prompt.length; index++){
            prompt[index] = input2.nextInt();
        }
        return prompt;
    }

    public static double input(double prompt){
        prompt = input3.nextDouble();
        return prompt;
    }
    public static double[] input(double[] prompt){
        for(int index = 0; index < prompt.length; index++){
            prompt[index] = input1.nextDouble();
        }
        return prompt;
    }

    public static float input(float prompt){
        prompt = input4.nextFloat();
        return prompt;
    }
    public static float[] input(float[] prompt){
        for(int index = 0; index < prompt.length; index++){
            prompt[index] = input1.nextFloat();
        }
        return prompt;
    }

//    public static char input(char prompt){
//        prompt = input.next().charAt(0);
//        return prompt;
//    }

    public static long input(long prompt){
        prompt = input1.nextLong();
        return prompt;
    }
    public static long[] input(long[] prompt){
        for(int index = 0; index < prompt.length; index++){
            prompt[index] = input1.nextLong();
        }
        return prompt;
    }

    public static boolean input(boolean prompt){
        prompt = input2.nextBoolean();
        return prompt;
    }

    public static boolean[] input(boolean[] prompt){
        for(int index = 0; index < prompt.length; index++){
            prompt[index] = input1.nextBoolean();
        }
        return prompt;
    }
}
