package Chapter2;

import java.util.Scanner;

public class WorldPopGrowthCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double currentCal = 9.7;

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                       www.sam_demography.com                            +");
        System.out.println("+                            SAM_DEMOGRAPHY                               +");
        System.out.println("+                            Office Address: Phase 2 Estate, Gbagada      +");
        System.out.println("+                       Email-Address: samuelabiodun324@gmail.com         +");
        System.out.println("+                       Phone Number: 08108857787                         +");
System.out.println("+(...A place that hosts the world's human population statistics)          +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("""
                +You need to know at least little about DEMOGRAPHY!                                       +
                +Welcome to SAM_DEMOGRAPHY!                                                               +
                +As at 2022, is the world population increasing or decreasing?                            +
                +The world's population continues to grow, but the pace of growth is slowing down.        +
                +The world's population is projected to reach 8 billion as at 15 November 2022 to 2030,   +
                +  9.7 billion in 2050 and 10.4 billion in 2100.                                          +""");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+Check in advance what the world's population would be                    +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("+                            Please enter the year to check or 0 to quit: ==> ");
        int noOfYears = input.nextInt();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println();
        System.out.println();
        if (noOfYears != 0) {
            if (noOfYears == 1) {
                double oneYearCal = currentCal + (0.009 * currentCal);
                System.out.printf("The current year world population is about 9.7 billion%n" +
                        "but would be %.2f billion after %d year", oneYearCal, noOfYears);
                System.out.println();
            }
           else if (noOfYears > 1) {
                double moreYears = currentCal + (0.009 * currentCal * noOfYears) ;
                System.out.printf("The current year world population is about 9.7 billion%n" +
                        "but would be %.2f billion after %d years", moreYears, noOfYears);
                System.out.println();
            }
        }
        else {
            System.out.println("Thanks for your using this app! ");
            System.out.println();
        }


    }
        }


