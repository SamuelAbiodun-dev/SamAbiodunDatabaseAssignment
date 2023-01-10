package myPrintAndInput;

import javax.swing.*;

public class printAndInput {

        public static String print(String prompt){
            JOptionPane.showMessageDialog(null, prompt);
            return prompt;
        }

    public static void print(int prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }

    public static void print(double prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }

    public static void print(float prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }

    public static void print(char prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }

    public static void print(long prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }

    public static void print(boolean prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }

    public static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public static String input(int prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public static String input(double prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public static String  input(float prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public static String input(char prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public static String input(long prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public static String input(boolean prompt){
        return JOptionPane.showInputDialog(prompt);
    }


}
