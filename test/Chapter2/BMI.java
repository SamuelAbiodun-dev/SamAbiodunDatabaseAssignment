package Chapter2;

import java.util.Scanner;


public class BMI {
    public static void main(String[] args) {
        Scanner samInput = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("||Underweight = < 18.5         ||");
        System.out.println("||Normal weight = 18.5-24.9    ||");
        System.out.println("||Overweight = 25-29.9         ||");
        System.out.println("||Obesity= BMI of 30 or greater||");
        System.out.println("---------------------------------");
        System.out.println("Enter your weight: ");
        double weight = samInput.nextDouble();
        System.out.println("Enter your height: ");
        double height = samInput.nextDouble();
        double bMI = (100 * 100 * weight) / (Math.pow(height, 2));
        System.out.println("Your Body Mass Index is: " + bMI + "kgm-2");
        if (bMI < 18.5){
            System.out.println("You are underweight!");
        }
        else if(bMI < 25){
            System.out.println("Your weight is normal!");
        }
        else if(bMI < 30){
            System.out.println("You are overweight!");
        }
        else{
            System.out.println("You are obese");
        }
    }
}
