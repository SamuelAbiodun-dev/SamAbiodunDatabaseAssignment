package Chapter3;

import java.util.Scanner;

class ClockAppTest {
    public static void main(String[] args) {
        int hour;
        int minute;
        int second;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of hours to get to class: ");
        hour = input.nextInt();

        System.out.println("Enter the number of minutes to get to class: ");
        minute = input.nextInt();

        System.out.println("Enter the number of seconds to get to class: ");
        second = input.nextInt();

        if(hour < 0 || minute < 0 || second < 0 || hour > 23 || minute > 59 || second > 59){
            System.out.println("Invalid input. Please try again!");
        }
        else {
       ClockApp clock = new ClockApp(hour, minute, second);
                clock.time();
            }
        }
    }
