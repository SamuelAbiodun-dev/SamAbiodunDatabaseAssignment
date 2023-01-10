package Chapter3;

import java.util.Scanner;

public class TellMeToday {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int day = input.nextInt();

//        System.out.print("Enter the number of days elapsed since today: ");
//        int daysElapsed = input.nextInt();

        //int futureDay = (day + daysElapsed) % 7;
        System.out.print("Today is ");
        switch (day) {
            case 0 -> System.out.print("Sunday");
            case 1 -> System.out.print("Monday");
            case 2 -> System.out.print("Tuesday");
            case 3 -> System.out.print("Wednesday");
            case 4 -> System.out.print("Thursday");
            case 5 -> System.out.print("Friday");
            case 6 -> System.out.print("Saturday");
        }
        System.out.print(" and the future day is ");
        //switch (futureDay) {
//            case 0 -> System.out.println("Sunday");
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");

            if(day == 0){
                System.out.println("Monday");
            }
            if(day == 1){
                System.out.println("Tuesday");
            }
            if(day == 2){
                System.out.println("Wednesday");
            }
            if(day == 3){
                System.out.println("Thursday");
            }
            if(day == 4){
                System.out.println("Friday");
            }
            if(day == 5){
                System.out.println("Saturday");
            }
            if(day == 6){
                System.out.println("Sunday");
            }
        }
    }

