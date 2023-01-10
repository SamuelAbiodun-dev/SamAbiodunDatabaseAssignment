package Chapter4;

import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        String set1 =
                """
                        1  3  5  7
                        9 11 13 15
                        17 19 21 23
                        25 27 29 31""";

        String set2 =
                """
                        2  3  6  7
                        10 11 14 15
                        18 19 22 23
                        26 27 30 31""";

        String set3 =
                """
                        4  5  6  7
                        12 13 14 15
                        24 25 26 27
                        28 29 30 31""";

        String set4 =
                """
                        8  9  10  11
                        12 13 14 15
                        24 25 26 27
                        28 29 30 31""";

        String set5 =
                """
                        16  17  18  19
                        20  21  22  23
                        24  25  26  27
                        28  29  30  31""";

        int day = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Is your birthday in Batch1?\n");
        System.out.print(set1);
        System.out.print("\nEnter Y for Yes and N for No: ");
        String yesOrNo = input.nextLine();
        char answer = yesOrNo.charAt(0);

        if(Character.toUpperCase(answer) == 'Y'){
            day += 1;
        }
        System.out.print("Is your birthday in Batch2\n");
        System.out.println(set2);
        System.out.println("\nEnter Y for Yes and N for No: ");
        yesOrNo = input.nextLine();
        answer = yesOrNo.charAt(0);

        if(Character.toUpperCase(answer) == 'Y'){
            day += 2;
        }
        System.out.print("Is your birthday in Batch3\n");
        System.out.println(set3);
        System.out.println("\nEnter Y for Yes and N for No: ");
        yesOrNo = input.nextLine();
        answer = yesOrNo.charAt(0);

        if(Character.toUpperCase(answer) == 'Y'){
            day += 4;
        }

        System.out.print("Is your birthday in Batch4\n");
        System.out.println(set4);
        System.out.println("\nEnter Y for Yes and N for No: ");
        yesOrNo = input.nextLine();
        answer = yesOrNo.charAt(0);

        if(Character.toUpperCase(answer) == 'Y'){
            day += 8;
        }

        System.out.print("Is your birthday in Batch5\n");
        System.out.println(set5);
        System.out.println("\nEnter Y for Yes and N for No: ");
        yesOrNo = input.nextLine();
        answer = yesOrNo.charAt(0);

        if(Character.toUpperCase(answer) == 'Y'){
            day += 16;
        }
        System.out.println("\nYour birthday is " + day + "!");
    }
}
